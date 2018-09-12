package Book.Implements;

import Book.Interfaces.Containment;

public class MyClass1<V> implements Containment<V> {
    private V[] arrayRef;

    MyClass1(V[] ob) {
        arrayRef = ob;
    }


    @Override
    public boolean contains(V o) {
        for (V x : arrayRef) {
            if (x.equals(o)) return true;
        }
        return false;
    }
}
