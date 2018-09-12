package Book.Implements;

import Book.Interfaces.IntPredicate;

// TODO: Ссылки на статические методы
// TODO: имя_класса::имя_метода
public class MethodRefDemo {

    static boolean numTest(IntPredicate p, int v) {
        return p.test(v);
    }

    public static void main(String[] args) {
        boolean result;

        // здесь методу numTest() передается ссылка на метод isPrime()
        result = numTest(MyIntPredicates::isPrime, 17);
        if (result) System.out.println("17 - prime number");

        //здесь методу numTest() передается ссылка на метод isEven()
        result = numTest(MyIntPredicates::isEven, 12);
        if (result) System.out.println("12 - even number");

        //здесь методу numTest() передается ссылка на метод isPositive()
        result = numTest(MyIntPredicates::isPositive, 11);
        if (result) System.out.println("11 - positive number");
    }
}
