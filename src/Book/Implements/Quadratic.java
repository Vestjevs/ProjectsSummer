package Book.Implements;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.System.out;


public class Quadratic {
    double x;

    Quadratic() {
    }


    synchronized void FindArgument(double a, double b, double c) {

        x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 / a);
        out.println("Первый корень: " + x);
        x = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 / a);
        out.println("Второй корень: " + x);

    }


//    public static void main(String[] args) {
//        Quadratic quadratic = new Quadratic(1, -5, 4);
//
//
//    }
}
