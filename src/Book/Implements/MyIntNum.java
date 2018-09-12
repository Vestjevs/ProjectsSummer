package Book.Implements;

//TODO : Ссылки на методы экземляров
//TODO : ссылка_на_объект::имя_метода
public class MyIntNum {
    private int v;

    MyIntNum(int x) {
        v = x;
    }

    int getNum(){
        return v;
    }

    boolean isFactor(int d) {
        return (v % d) == 0;
    }
    boolean hasCommonfFactor(MyIntNum num, int n ){
        return Boolean.parseBoolean(null);
    }
}
