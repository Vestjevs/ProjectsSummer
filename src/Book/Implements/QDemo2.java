package Book.Implements;

public class QDemo2 {

    protected static class Queue<E> {

        private E[] elements;
        private int getloc, size;

        Queue(int CAPACITY) {
            elements = (E[]) new Object[CAPACITY + 1];
            getloc = size = 0;
        }

        Queue(Queue<E> object){
            size = object.size;
            getloc = object.getloc;
            elements = (E[]) new Object[object.elements.length];

            for(int i = getloc + 1; i <= size; i++)
                elements[i] = object.elements[i];
        }

        Queue(E[] a){
            size = 0;
            getloc = 0;
            elements =(E[]) new Object[a.length + 1];

            for (int i = 0; i < a.length; i++) {
                add(a[i]);
            }
        }

        void add(E element) {
            if (size == elements.length - 1) {
                System.err.println("  - Queue is full");
            }
            size++;
            elements[size] = element;
        }

        E get() {
            if (getloc == size) {
                System.err.println("  - Queue is empty");
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

}
