package Book.Interfaces;

import Book.Implements.QueueEmptyException;
import Book.Implements.QueueFullException;

public interface IQueue<V> {

    // Поместить элемент в очередь
    void put(V element) throws QueueFullException;

    // Извлечь элемент из очереди
    V get() throws QueueEmptyException;

    // Возвращает true, если очередь пустая
    default boolean isEmpty() {
        return true;
    }

    // Возвращает размер очереди
    int size();

    // Сбрасывает очередь в исходное состояние

}
