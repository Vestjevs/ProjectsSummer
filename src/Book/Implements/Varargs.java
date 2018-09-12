package Book.Implements;

import Book.Implements.Book;

public class Varargs<E> {

    static void vaTest(Object... v) {
        System.out.println("Quantity arguments" + v.length);
        System.out.println("Содержимое: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);

        }
        System.out.println();
    }

    static void vaTest2(String msg, Object... v) {
        System.out.println(msg + v.length);
        System.out.println("Содержимое: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }
        System.out.println();
    }


    public static void main(String[] args) {
     /*   vaTest("asasd1", "asdas498");
        vaTest(1, 2, 3);
        vaTest();*/
        vaTest2("One argument: ", 10);
        vaTest2(" Three arguments: ", 1, 3, 4);
    }
}
