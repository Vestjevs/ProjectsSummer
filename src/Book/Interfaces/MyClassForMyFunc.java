package Book.Interfaces;

public class MyClassForMyFunc {

    private String str;
    private int i;

    public MyClassForMyFunc(String s) {
        str = s;
    }

    public MyClassForMyFunc(int k) {
        i = k;
    }

    MyClassForMyFunc() {
        str = "";
    }

    public String getStr() {
        return str;
    }
}
