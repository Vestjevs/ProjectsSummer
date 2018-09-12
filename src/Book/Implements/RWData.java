package Book.Implements;

import java.io.*;

public class RWData {
    public static void main(String[] args) throws FileNotFoundException {
        int i = 10;
        double d = 1023.56;
        boolean b = true;
        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("Testdata"))) {
            System.out.println("Write: " + i);
            dataOut.writeInt(i);

            System.out.println("Write: " + d);
            dataOut.writeDouble(d);

            System.out.println("Write: " + b);
            dataOut.writeBoolean(b);

            System.out.println("Write: " + 12.2 * 7.4);
            dataOut.writeDouble(12.2 * 7.4);
        } catch (IOException e) {
            System.out.println("Error recording");
            return;
        }

        System.out.println();

        try (DataInputStream dataIn = new DataInputStream(new FileInputStream("Testdata"))) {
            i = dataIn.readInt();
            System.out.println("Reading: " + i);

            d = dataIn.readDouble();
            System.out.println("Reading: " + d);

            b = dataIn.readBoolean();
            System.out.println("Reading: " + b);

            d = dataIn.readDouble();
            System.out.println("Reading: " + d);
        } catch (IOException exc) {
            System.out.println("Error reading");

        }
    }
}
