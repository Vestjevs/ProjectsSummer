package Book.Implements;

public class Overload {
    void ovlDemo() {
        System.err.println("Without argument");
    }

    void OvlDemo(int a) {
        System.err.println("One argument: " + a);
    }

    int ovlDemp(int a, int b) {
        System.err.println("Two argument int type " + a + " " + b);
        return a + b;
    }

    double ovlDemo(double a, double b) {
        System.err.println("Two argument double type" + a + " " + b);

        return a + b;
    }
}
