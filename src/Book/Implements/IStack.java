package Book.Implements;

public interface IStack<V> {

    void push(V element);

    V pop() throws StackEmptyException;

    int sizeOf();
}
