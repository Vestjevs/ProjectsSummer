package DataStructures.Implements;

import DataStructures.Interfaces.IQueue;

import java.util.NoSuchElementException;

public class ArrayQueue<E> implements IQueue<E> {

    private E[] elements;
    private int locF, size, nElement;
    private int CAPACITY;

    public ArrayQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        elements = (E[]) new Object[CAPACITY + 1];
        locF = size = nElement = 0;

    }

    @Override
    public E peek() throws NoSuchElementException {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return elements[locF];
    }

    @Override
    public E pop() throws NoSuchElementException {
        if (size == 0) {
            throw new NoSuchElementException();
        } else {
            locF++;
            size--;
            return elements[locF - 1];
        }
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
        try {
            size++;
            elements[nElement++] = element;
        } catch (RuntimeException exc) {
            System.out.println();
        }

    }
}
