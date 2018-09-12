package DataStructures.Interfaces;


public interface IList<E> extends ICollection<E>, Iterable<E> {
    /**
     * Inserts {@code element} on {@code index} position
     *
     * @throws IndexOutOfBoundsException - if index is out of bounds
     */
    void insert(int index, E element) throws IndexOutOfBoundsException;

    /**
     * @param index - index of element to get
     * @return element at {@code index} position
     * @throws IndexOutOfBoundsException - if index is out of bounds
     */
    E get(int index) throws IndexOutOfBoundsException;

    /**
     * @param index - index of element to remove
     * @return element at {@code index} position before remove
     * @throws IndexOutOfBoundsException - if index is out of bounds
     */
    E remove(int index) throws IndexOutOfBoundsException;

    /**
     * @param element - element to search
     * @return index of {@code element} if it present in list or -1 either
     */
    int find(E element);

    /**
     * @param element - element to search
     * @return true if element is present in collection
     */


    default boolean contains(E element) {
        return find(element) > -1;
    }

}