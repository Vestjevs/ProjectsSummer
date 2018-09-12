package DataStructures.Interfaces;

import DataStructures.Implements.StackFullException;

public interface ICollection<E> {
    /**
     * Checks if collection contains any element
     *
     * @return true if collection is empty
     */
    boolean isEmpty();

    /**
     * @return number of elements stored in collection
     */
    int size();

    /**
     * Adds given element to collection
     *
     * @param element to add
     */
    void add(E element);
}

