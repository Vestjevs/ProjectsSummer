package Book.Implements;

import Book.Interfaces.IQueue;

import static java.lang.System.arraycopy;

public class FixedQueueImpl<E> implements IQueue<E> {
    private E[] elements;
    private int putloc, getloc;

    FixedQueueImpl(int CAPACITY) {
        elements = (E[]) new Object[CAPACITY + 1];
        putloc = getloc = 0;
    }

    @Override
    public void put(E element) throws QueueFullException {
        {
            if (putloc == elements.length - 1) {
                throw new QueueFullException(elements.length - 1);
            }
            putloc++;
            elements[putloc] = element;
        }
    }

    @Override
    public E get() throws QueueEmptyException {
        if (getloc == putloc) {
            throw new QueueEmptyException();

        }
        getloc++;
        return elements[getloc];
    }

    @Override
    public boolean isEmpty() {
        return putloc == 0;
    }

    @Override
    public int size() {
        return putloc;
    }

    static char[] CopyPast(FixedQueueImpl fixedQueue) {
        char[] NEWONE = new char[fixedQueue.elements.length];
        arraycopy(fixedQueue.elements, 0, NEWONE, 0, fixedQueue.elements.length);

        return NEWONE;
    }

}
