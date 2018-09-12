package Book.Implements;

public class Queue {
    private char[] elements;
    private int getloc, size;

    Queue(int CAPACITY) {
        elements = new char[CAPACITY + 1];
        getloc = size = 0;
    }

    Queue(Queue object) {
        size = object.size;
        getloc = object.getloc;
        elements = new char[object.elements.length];

        for (int i = getloc + 1; i <= size; i++)
            elements[i] = object.elements[i];
    }

    Queue(char[] a) {
        size = 0;
        getloc = 0;
        elements = new char[a.length + 1];

        for (int i = 0; i < a.length; i++) {
            add(a[i]);
        }
    }

    void add(char element) {
        if (size == elements.length - 1) {
            System.err.println("  - Queue is full");
            return;
        }
        size++;
        elements[size] = element;
    }

    char get() {
        if (getloc == size) {
            System.err.println("  - Queue is empty");
            return (char) 0;
        }
        getloc++;
        return elements[getloc];
    }

    int sizeof() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }
}
