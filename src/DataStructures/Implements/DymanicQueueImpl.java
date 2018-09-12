package DataStructures.Implements;

import DataStructures.Interfaces.IQueue;

import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class DymanicQueueImpl<E> implements IQueue<E> {
    private E[] elements;
    private int nElem, size;

    DymanicQueueImpl(int CAPACITY) {
        elements = (E[]) new Object[CAPACITY + 1];
        nElem = size = 0;
    }


    private void put(E element) {
        if (nElem == elements.length - 1) {
            E[] elementsNEW = (E[]) new Object[elements.length * 2];
            for (int i = 0; i < elements.length; i++)
                elementsNEW[i] = elements[i];
            elements = elementsNEW;
        }
        nElem++;
        elements[nElem] = element;
    }


    private E get() {
        if (size == 0) {
            System.out.println(" - Queue is empty");
        }
        size++;
        return elements[size];
    }

    @Override
    public boolean isEmpty() {
        return nElem == 0;
    }

    @Override
    public int size() {
        return nElem;
    }

    @Override
    public void add(E element) {
        this.put(element);
    }

    E[] CopyPast(DymanicQueueImpl dymanicQueue) {
        E[] NEWONE = (E[]) new Object[dymanicQueue.elements.length];
        IntStream.range(0, dymanicQueue.elements.length).forEach(i -> NEWONE[i] = (E) dymanicQueue.elements[i]);

        return NEWONE;
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
