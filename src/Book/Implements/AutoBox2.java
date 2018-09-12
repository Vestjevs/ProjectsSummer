package Book.Implements;

public class AutoBox2 {
    static void m(Integer v){
        System.out.println("m() получил " + v);
    }
    static int m2(){
        return 10;
    }
    static Integer m3(){
        return 99;
    }

    public static void main(String[] args) {
        m(199);

        Integer iOB = m2();
        System.out.println("Значение, возвращенное из m2(): " + iOB);

        int i = m3();
        System.out.println("Значение, возвращенное из m3(): " + i);
        iOB = 100;
        System.out.println("Корень квадратный из iOB " + Math.sqrt(100));
    }
}
