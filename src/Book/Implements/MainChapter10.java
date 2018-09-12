package Book.Implements;

import java.io.IOException;
import java.util.Scanner;

public class MainChapter10 {
    public static void main(String[] args) throws IOException {

//        byte[] data = new byte[10];
//        System.out.println("Введите символы: ");
//        System.in.read(data);
//        System.out.println("Вы ввели: ");
//        IntStream.range(0, data.length).forEachOrdered(i -> {
//            byte aData = data[i];
//            System.out.print((char) (aData));
//        });
//        int b = 'A';
//        for (int i = 0; i < 10; i++) {
//            System.out.write(b + i);
//            System.out.write('\n');
//        }
//        int i;
//
//        if (args.length != 2) {
//            System.out.println("Using of CopyFile откуда куда");
//            return;
//        }
//
//        try (FileInputStream fin = new FileInputStream(args[0]);
//             FileOutputStream fout = new FileOutputStream(args[1])) {
//
//            do {
//                i = fin.read();
//                if (i != -1) fout.write(i);
//            } while (i != -1);
//        } catch (IOException exc) {
//            System.out.println("Error of input and output: " + exc);
//        }
//
//        int i;
//        if (args.length != 1) {
//            System.out.println("Using of ShowFile Test");
//            return;
//        }
//        try (FileInputStream fin = new FileInputStream(args[0])) {
//            do {
//                i = fin.read();
//                if (i != -1) System.out.print((char) i);
//            } while ((i != -1));
//
//        } catch (IOException exc) {
//            System.out.println("Ошибка ввода - вывода: " + exc);
//        }

//        Демонстрация произвольного доступа к файлам
//
//        double[] data = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25, 26.94};
//        double d;
//
//        String[] src = {"First", "Second", "Third", "Fourth", "Fives", "Sixth", "Seventh"};
//        String s;
//        int k = 0;
//
//        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw");
//             RandomAccessFile raf2 = new RandomAccessFile("random2.dat", "rw")) {
//            for (int i = 0; i < data.length; i++) {
//                raf.writeDouble(data[i]);
//            }
//            for (int i = 0; i < src.length; i++) {
//                raf2.writeUTF(src[i]);
//            }
//            raf.seek(0);
//            d = raf.readDouble();
//
//            raf2.seek(0);
//            s = raf2.readUTF();
//
//            System.out.println(s + " value :" + d);
//
//            raf.seek(8);
//            d = raf.readDouble();
//
//            raf2.seek(7);
//            s = raf2.readUTF();
//
//            System.out.println(s + " value: " + d);
//
//            raf.seek(16);
//            d = raf.readDouble();
//
//            raf2.seek(15);
//            s = raf2.readUTF();
//
//            System.out.println(s + " value: " + d);
//
//
//            raf.seek(24);
//            d = raf.readDouble();
//
//            raf2.seek(22);
//            s = raf2.readUTF();
//
//            System.out.println(s + " value: " + d);
//
//            raf.seek(8 * 4);
//            d = raf.readDouble();
//
//            raf2.seek(30);
//            s = raf2.readUTF();
//
//            System.out.println(s + " value: " + d);
//
//            raf.seek(8 * 5);
//            d = raf.readDouble();
//
//            raf2.seek(37);
//            s = raf2.readUTF();
//
//            System.out.println(s + " value: " + d);
//
//            raf.seek(8 * 6);
//            d = raf.readDouble();
//
//            raf2.seek(45);
//            s = raf2.readUTF();
//
//            System.out.println(s + " value: " + d);
//
//            System.out.println();
//
//            for (int i = 0; i < data.length; i++) {
//                raf.seek(8 * i);
//                d = raf.readDouble();
//                if (i == 0) k += 0;
//                if (i % 2 == 0) k += 7;
//                else k += 8;
//                raf2.seek(k);
//                s = raf2.readUTF();
//
//                System.out.print(s + " value: " + d);
//
//            }
//            System.out.println();
//
//            System.out.println("Чтение значений с нечетными порядковыми номерами");
//            for (int i = 0; i < data.length; i += 2) {
//                raf.seek(8 * i);
//                d = raf.readDouble();
//                raf2.seek(8 * i);
//                s = raf2.readUTF();
//                System.out.print(s + ": " + d);
//            }
//        } catch (IOException exc) {
//            System.out.println("Error input and output: " + exc);
//        }
//


//        char c;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        System.out.println("Введите символы: окончание ввода - символ точки");
//        do {
//            c = (char) br.read();
//            System.out.print(c);
//        } while (c != '.');

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String str;
//
//        System.out.println("Введите текстовые строки");
//        System.out.println("Признак конца ввода - строка 'stop'");
//
//        do {
//            str = br.readLine();
//            System.out.println(str);
//        }
//        while (!str.equals("stop"));
//        PrintWriter pw = new PrintWriter(System.err, true);
//        int i = 10;
//        double d = 123.65;
//        double[] doubles = {10.2, 25.02, 2.52, 58.12};
//
//        pw.println("Using class PrintWriter");
//        pw.println(i);
//        pw.println(d);
//
//        pw.println(i + " + " + d + " = " + (i + d));
//        pw.println(Arrays.toString(doubles));

//
        Scanner conin = new Scanner(System.in);
        int i;
        if (conin.hasNext()) {
            i = conin.nextInt();
            System.out.println("You put Integer value: " + i);
        }
    }
}