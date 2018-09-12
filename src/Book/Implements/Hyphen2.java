package Book.Implements;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Hyphen2 {
    public static void main(String[] args) {
        int i;

        if (args.length != 2) {
            System.out.println("Using: CopyFile откуда куда");
            return;
        }
        try (FileReader fin = new FileReader(args[0]);
             FileWriter fout = new FileWriter(args[1])) {
            do {
                i = fin.read();
                if ((char) i == ' ') i = '-';

                if (i != -1) fout.write(i);
            } while (i != -1);


        } catch (IOException exc) {
            System.out.println("Error input-output: " + exc);
        }
    }
}
