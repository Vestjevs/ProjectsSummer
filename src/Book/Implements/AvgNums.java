package Book.Implements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class AvgNums {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.err, true);

        String str;
        int n;
        double sum = 0;
        double avg, t;

        System.out.print("Сколько чисел вы введете: ");
        str = br.readLine();

        try {
            n = Integer.parseInt(str);
        } catch (NumberFormatException exc) {
            pw.println("Неверный формат");
            n = 0;
        }

        System.out.println("Input " + n + " values");
        for (int i = 0; i < n; i++) {
            pw.print(": ");
            str = br.readLine();
            try {
                t = Double.parseDouble(str);

            } catch (NumberFormatException exc) {
                pw.println("Unsupport fornat");
                t = 0.0;
            }
            sum += t;
        }
        avg = sum / n;
        pw.println("Среднее значение: " + avg);


    }
}
