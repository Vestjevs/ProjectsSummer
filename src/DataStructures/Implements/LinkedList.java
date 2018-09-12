package DataStructures.Implements;

import DataStructures.Interfaces.IList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<E> implements IList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    private static class Node<E> {
        E item;
        Node<E> prev;
        Node<E> next;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.prev = prev;
            this.next = next;
        }
    }

    public LinkedList() {
    }

    @Override
    public void insert(int index, E element) throws IndexOutOfBoundsException {
        this.checkRange(index);

        if (index == size) {
            this.add(element);
            return;
        }

        Node<E> currNode = getNode(index);
        Node<E> exNode;

        if (index == 0) {
            Node<E> firstNode = head;
            exNode = new Node<>(null, element, currNode);
            head = exNode;
            firstNode.prev = head;
            size++;
        }
        exNode = new Node<>(currNode.prev, element, currNode);
        if (exNode.prev != null) {
            exNode.prev.next = exNode;
        }
        if (exNode.next != null) {
            exNode.next.prev = exNode;
        }
        size++;


    }

    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        this.checkRange(index);
        return getNode(index).item;
    }

    @Override
    public E remove(int index) throws IndexOutOfBoundsException {
        this.checkRange(index);

        Node<E> RemNode = this.getNode(index);
        Node<E> NextFromRnNode = RemNode.next;
        Node<E> PrevFromRnNode = RemNode.prev;

        if (NextFromRnNode != null) {
            NextFromRnNode.prev = PrevFromRnNode;
        }
        if (PrevFromRnNode != null) {
            PrevFromRnNode.next = NextFromRnNode;
        }
        if (index == 0 && NextFromRnNode != null) {
            this.head = NextFromRnNode;
        }
        size--;

        return RemNode.item;
    }

    @Override
    public int find(E element) {
        int index = 0;
        Node<E> currNode = head;

        while (currNode != null) {
            if (currNode.item.equals(element)) {
                return index;
            }
            currNode = currNode.next;
            index++;
        }
        return -1;
    }


    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E element) {
        Node<E> prevElement = tail;
        Node<E> currElement = new Node<>(prevElement, element, null);
        tail = currElement;

        if (prevElement == null) {
            head = currElement;
        } else {
            prevElement.next = currElement;
        }
        size++;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> curNode = head;

            @Override
            public boolean hasNext() {
                if (curNode == null) {
                    return false;
                }
                return true;
            }

            @Override
            public E next() {
                if (!hasNext()) throw new NoSuchElementException();
                E item = curNode.item;
                curNode = curNode.next;
                return item;
            }

        };
    }

    private void checkRange(int index) {
        if (index >= size || size < 0)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    private Node<E> getNode(int index) {
        this.checkRange(index);
        int i = 0;

        for (Node<E> currNode = head; ; currNode = currNode.next) {
            if (i == index)
                return currNode;
            i++;
        }
    }

}
