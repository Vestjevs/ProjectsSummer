package Book.Implements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class DtoS {
    public static void main(String[] args) {
        String str;
        PrintWriter pw = new PrintWriter(System.err, true);
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {

            while ((str = br.readLine()) != null) {
                pw.println(str);
            }
        } catch (IOException exc) {
            pw.println("Error input - output: " + exc);

        }
    }
}
