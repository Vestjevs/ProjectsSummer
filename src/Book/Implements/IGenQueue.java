package Book.Implements;

// The generalized interface of queue
public interface IGenQueue<V> {

    //  put element in the queue
    void put(V element) throws QueueFullException;

    //  extract element from the queue
    V get() throws QueueEmptyException;
}
