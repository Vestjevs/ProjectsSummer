package DataStructures.Interfaces;

import java.util.EmptyStackException;

public interface IStack<E> extends ICollection<E> {
    /**
     * @return element from top of stack
     * @throws EmptyStackException - if operation called on empty stack
     */
    E peek() throws EmptyStackException;

    /**
     * Just like {@link #peek() peek} but also removes top element from stack
     *
     * @return element from top of stack
     * @throws EmptyStackException - if operation called on empty stack
     */
    E pop() throws EmptyStackException;

    /**
     * Alias for {@link ICollection#add(Object) add} method
     */
    default void push(E element) {
        add(element);
    }
}