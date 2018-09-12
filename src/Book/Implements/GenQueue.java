package Book.Implements;

import Book.Interfaces.IQueue;

public class GenQueue<V> implements IQueue<V> {
    private V[] elements;
    private int putloc, getloc;



    GenQueue(V[] aRef) {
        elements = aRef;
        putloc = getloc = 0;
    }

    GenQueue(int CAPACITY) {
        elements = (V[]) new Object[CAPACITY + 1];
        putloc = getloc = 0;

    }

    GenQueue(GenQueue genQueue) {
        elements = (V[]) genQueue.elements;
    }

    @Override
    public void put(V element) throws QueueFullException {
        if (putloc == elements.length - 1) throw new QueueFullException(elements.length);

        elements[putloc++] = element;
    }

    @Override
    public V get() throws QueueEmptyException {
        if (getloc == putloc)
            throw new QueueEmptyException();

        return elements[getloc++];
    }

    @Override
    public int size() {
        return putloc;
    }

    @Override
    public boolean isEmpty() {
        return putloc == 0;
    }
}
