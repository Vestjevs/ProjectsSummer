package Book.Implements;

import java.io.*;

public class KtoD {
    public static void main(String[] args) {
        String str;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.err, true);
        pw.println("Признак конца ввода - строка 'stop'");

        try (FileWriter fw = new FileWriter("test.txt")) {
            do {
                pw.print(": ");
                str = br.readLine();
            } while (str.compareTo("stop") != 0);

        } catch (IOException exc) {
            pw.println("Error input-output: " + exc);
        }
    }
}
