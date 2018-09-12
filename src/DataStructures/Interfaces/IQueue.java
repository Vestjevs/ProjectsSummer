package DataStructures.Interfaces;

import java.util.NoSuchElementException;

public interface IQueue<E> extends ICollection<E> {
    /**
     * @return element from start of queue
     * @throws NoSuchElementException - if operation called on empty queue
     */

    E peek() throws NoSuchElementException;

    /**
     * Just like {@link #peek() peek} but also removes start element from queue
     *
     * @return element from start of queue
     * @throws NoSuchElementException - if operation called on empty queue
     */
    E pop() throws NoSuchElementException;

    /**
     * Alias for {@link ICollection#add(Object) add} method
     */
    default void push(E element) {
        add(element);
    }
}