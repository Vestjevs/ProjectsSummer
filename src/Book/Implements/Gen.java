package Book.Implements;

public class Gen<V> {
    V[] ob;

    Gen(int CAPACITY){
        ob =(V[]) new Object[CAPACITY];
    }

    V[] getOb(){
        return ob;
    }
    void showType(){
        System.err.println("Type V - is " + ob.getClass().getName());
    }
}
