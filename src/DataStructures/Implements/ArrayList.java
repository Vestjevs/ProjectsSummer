package DataStructures.Implements;

import DataStructures.Interfaces.IList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<E> implements IList<E> {

    private E[] elements;
    private int CAPACITY;
    private int size;

    public ArrayList(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        elements = (E[]) new Object[CAPACITY];

    }

    @Override
    public void insert(int index1, E element) throws IndexOutOfBoundsException {
        this.rangeCheck(index1);
        elements[index1] = element;
        size++;
    }

    @Override
    public E get(int index1) throws IndexOutOfBoundsException {
        this.rangeCheck(index1);
        return elements[index1];
    }

    @Override
    public E remove(int index1) throws IndexOutOfBoundsException {
        this.rangeCheck(index1);

        E element2 = this.elements[index1];

        for (int i = index1; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        size--;
        return element2;
    }

    @Override
    public int find(E element) {
        for (int i = 0; i <= CAPACITY; i++)
            if (elements[i].equals(element))
                return i;
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
        if (size == CAPACITY) throw new IndexOutOfBoundsException();
        elements[size] = element;
        size++;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int cursor;

            @Override
            public boolean hasNext() {
                return cursor != size;
            }

            @Override
            public E next() {
                if (cursor >= size) {
                    throw new NoSuchElementException();
                }
                cursor++;
                return elements[cursor - 1];
            }
        };
    }


    private int indexOf(E element) {
        for (int i = 0; i <= CAPACITY; i++) {
            if (elements[i].equals(element))
                return i;
        }
        return -1;
    }

    private void rangeCheck(int index1) {
        if (index1 >= this.size || index1 < 0) {
            throw new IndexOutOfBoundsException();
        }
    }
}
