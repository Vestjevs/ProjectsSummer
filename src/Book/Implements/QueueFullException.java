package Book.Implements;

public class QueueFullException extends Exception {
    int size;

    QueueFullException(int s) {
        size = s - 1;
    }

    public String toString() {
        return "\nОчередь заполнена. Максимальный размер: " + size;
    }
}
