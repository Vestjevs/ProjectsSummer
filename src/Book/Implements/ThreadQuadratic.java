package Book.Implements;

import java.io.*;

public class ThreadQuadratic implements Runnable {
    Thread thrd;
    Quadratic quadratic;
    double t1, t2, t3;
    String str1, str2, str3;


    ThreadQuadratic(String name) {
        thrd = new Thread(this, name);
        quadratic = new Quadratic();
        thrd.start();

    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + ":");
        System.out.println("Введите пожалуйста коэффициенты a, b, c через Enter");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            do {
                System.out.println("Если вы хотите остановиться, введите 'stop'");

                str1 = br.readLine();

                if (!str1.equals("stop")) {
                    str2 = br.readLine();
                    str3 = br.readLine();

                    t1 = Double.parseDouble(str1);
                    t2 = Double.parseDouble(str2);
                    t3 = Double.parseDouble(str3);

                    System.out.println("Вы ввели коэффициенты для уравнения: " + t1 + "*x^2" + " + (" + t2 + ")*x + ( " + t3 + " ) = 0");
                    quadratic.FindArgument(t1, t2, t3);
                }

            } while (!str1.equals("stop"));

            System.err.println("Окончание программы");

        } catch (IOException exc) {
            System.out.println(exc);
        }

    }
}
