package Book.Implements;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Hyphen {
    public static void main(String[] args) {

        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        if (args.length != 2) {
            System.out.println("Использование: Hyphen откуда куда");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if ((char) i == ' ') i = '-';
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Error input-output: " + exc);
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException exc) {
                System.out.println("Error of closing input file.");
            }
            try {
                if (fout != null) fout.close();
            }catch (IOException exc){
                System.out.println("Error of closing output file.");
            }
        }
    }
}
