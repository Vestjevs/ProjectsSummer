package DataStructures.Implements;

import DataStructures.Interfaces.IQueue;

import java.util.NoSuchElementException;

public class CircularQueueImpl<E> implements IQueue<E> {
    private E[] elements;
    private int putloc, getloc;

    public CircularQueueImpl(int CAPACITY) {
        elements = (E[]) new Object[CAPACITY + 1];
        getloc = putloc = 0;

    }


    private void put(E element) {
        /*
         * Очередь считается полной, если индекс putloc на единицу
         * меньше индекса getloc или если индекс putloc указывает на
         * конец массива, а индекс getloc - на его начало
         * */
        if ((putloc + 1 == getloc) | (putloc == elements.length - 1 & getloc == 0)) {
            System.out.println(" - Queue is full");
            return;
        }
        putloc++;
        if (putloc == elements.length) putloc = 0;
        elements[putloc] = element;
    }


    public E get() throws IndexOutOfBoundsException {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty");
        }
        getloc++;
        if (getloc == elements.length) getloc = 0;

        return elements[getloc];
    }


    public boolean isEmpty() {
        return putloc == 0;
    }


    public int size() {
        return putloc;
    }

    @Override
    public void add(E element) {
        this.put(element);

    }

    static String CopyPast(CircularQueueImpl circularQueue) {
        CircularQueueImpl circularQueue1 = new CircularQueueImpl(circularQueue.elements.length);
        for (int i = 0; i < circularQueue.elements.length; i++) {
            circularQueue1.elements[i] = circularQueue.elements[i];
        }
        return String.valueOf(circularQueue1);
    }

    @Override
    public E peek() throws NoSuchElementException {
        return this.get();
    }

    @Override
    public E pop() throws NoSuchElementException {
        return null;
    }
}
