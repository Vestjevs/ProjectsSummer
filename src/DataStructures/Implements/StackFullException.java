package DataStructures.Implements;

public class StackFullException extends Exception {
    int size;

    StackFullException(int s) {
        size = s;
    }

    public String toString() {
        return "\nArrayStack заполнен. Максимальный размер: " + size;
    }
}
