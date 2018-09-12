package Book.Implements;

// TODO: 21.07.18

public class TwoGen<T, V> {
    private T ob1;
    private V ob2;

    TwoGen(T o1, V o2){
        ob1 = o1;
        ob2 = o2;
    }
    void showTypes(){
        System.err.println("Type T - " + ob1.getClass().getSimpleName());
        System.err.println("Type V - " + ob2.getClass().getCanonicalName());
    }

    T getOb1(){
        return ob1;
    }
    V getOb2(){
        return ob2;
    }
}
