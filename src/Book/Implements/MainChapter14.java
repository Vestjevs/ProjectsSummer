package Book.Implements;

import Book.Interfaces.StringFunc;

public class MainChapter14 {
    static String changeStr(StringFunc strfun, String s) {
        return strfun.func(s);
    }

    public static void main(String[] args) {


////        MyValue myValue = () -> 98.6;
////        System.out.println("Постоянное значение: " + myValue.getValue());
//
////        MyParamValue myPval = (n) -> 1.0 / n;
////
////        IntStream.range(0, 10).mapToObj(i -> "Значение, обратному значению, " + i + " равно: " + myPval.getValue(i)).forEachOrdered(System.out::println);
//        NumericTest<Integer> isFactor = (n, m) -> (n % m) == 0;
//
//        if (isFactor.test(10, 2))
//            System.out.println("2 является делителем 10");
//        if (!isFactor.test(10, 3))
//            System.out.println(" 3 не явлется делителем 10");
//        System.out.println();
//
//        NumericTest<Integer> lessThan = (n, m) -> (n < m);
//
//        if (lessThan.test(2, 10))
//            System.out.println("2 less than 10");
//        if (!lessThan.test(10, 2))
//            System.out.println("10 не меньше 2");
//        System.out.println();
//
//        NumericTest<Integer > absEqual = ((n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m));
//
//        if (absEqual.test(4, -4))
//            System.out.println("Абсолютные величины 4 и -4 равны");
//        if (!absEqual.test(4, -5))
//            System.out.println("Абсолютные величины 4 и -5 не равны");
//
////        StringTest isIn = String::contains;
////
////        String str = "This is test";
////        System.out.println("Тестируемая строка: " + str);
////
////        if (isIn.test(str, "This"))
////            System.out.println("'This' найдено");
////        else
////            System.out.println("'This' не найдено");
////        if(isIn.test(str, "is"))
////            System.out.println("'is' found");
////        else
////            System.out.println("'is' did not find");
//
////        NumericFunc smallestF = (n) -> {
////            int result = 1;
////
////            // Get absolute value of n.
////            n = n < 0 ? -n : n;
////
////            for (int i = 2; i <= n / i; i++)
////                if ((n % i) == 0) {
////                    result = i;
////                    break;
////                }
////            return result;
////
////        };
////
////        System.out.println("Наименьшим делителем 12 является: " + smallestF.func(12));
////        System.out.println("Наименьшим делителем 11 является: " + smallestF.func(11));
//        SomeTest<Integer> isFactorI = (n, d) -> (n % d) == 0;
//
//        if (isFactorI.test(10, 2))
//            System.out.println(" 2 является делителем 10");
//
//        SomeTest<Double> isFactorD = (n, d) -> (n % d) == 0;
//
//        if (isFactorD.test(212.0, 4.0))
//            System.out.println(" 4.0 является делителем 212.0");
//
//        SomeTest<String> isIn = String::contains;
//
//        if(isIn.test("The generalized functional interface ","face"))
//            System.out.println("слово 'интерфейс' найдено ");
//        int num = 10;
//
//        MyFunc myLambda = (n) -> {
//            int v = n + num;
//
//
//            return v;
//        };
//        Double[] values = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0};
//
//        MyTransform<Double> sqrts = (a) -> {
//            for (int i = 0; i < a.length; i++) a[i] = Math.sqrt(a[i]);
//
//        };
//        sqrts.transform(values);
//
//        System.out.println(Arrays.toString(values));


        //TODO : Ссылки на методы экземляров
        //TODO : ссылка_на_объект::имя_метода
        //TODO : имя_класса::имя_метода_экземпляра

//        boolean result;
//        MyIntNum myNum = new MyIntNum(12);
//        MyIntNum myNum2 = new MyIntNum(16);
//
//        IntPredicate ip = myNum::isFactor;
//
//        result = ip.test(3);
//        if (result) System.out.println("3 является делителем " + myNum.getNum());
//
//        ip = myNum2::isFactor;
//        result = ip.test(3);
//
//        if (!result) System.out.println("3 !не является делителем " + myNum2.getNum());
//

//        boolean result;
//        MyIntNum myNum = new MyIntNum(12);
//        MyIntNum myNum2 = new MyIntNum(16);
//
//        // Создать ссылку inp на экземплярный метод isFactor()
//        MyIntNumPredicate inp = MyIntNum::isFactor;
//
//        //Вызвать метод isFactor() ждя объекта myNum
//        result = inp.test(myNum, 3);
//        if (result) System.out.println("3 является делителем " + myNum.getNum());
//
//        //Вызвать метод isFactor() for object myNum2
//        result = inp.test(myNum2, 3);
//        if(!result) System.out.println("3 не является делителем " + myNum2.getNum());


        //TODO: Ссылки на конструкторы

//        MyFunc2 myClassCons = MyClassForMyFunc::new;
//
//        //Создать экземляр MyClass посредством ссылки на конструктор
//        MyClassForMyFunc myClassForMyFunc = myClassCons.func("Testing");
//
//        //Использовать только что созданный экземпляр MyClass
//        System.out.println("Строка str в mc: " + myClassForMyFunc.getStr());
//
//        //TODO | В общем случае при использовании ссылок вида ::new будет вызываться конструк­
//        //TODO | тор, параметры которого соответствуют параметрам, указанным в функциональном ин­
//        //TODO | терфейсе.

//        MyClassArrayCreator<Integer> mcArrayCons = MyClassForMyFunc[]::new;
//        MyClassForMyFunc[] a = mcArrayCons.func(3);
//        for (int i = 0; i < 3; i++) {
//            a[i] = new MyClassForMyFunc(i);
//        }
//        Predicate<Integer> isEven = (n) -> (n % 2) == 0;
//
//        if (isEven.test(4))
//            System.out.println("4 - is even");
//        if (!isEven.test(5))
//            System.out.println("5 - is not even");

//        Predicate<Integer> isRangeOf = (n) -> (n > 9) && (n < 21);
//        if(isRangeOf.test(11)) System.out.println("11 relates to range 10:20");
//        if(!isRangeOf.test(5)) System.out.println("5 does not to range 10:20");
//

//        NumericFunc<Integer> Factorial = (n) -> {
//            int k = 1;
//            for (int i = 1; i <= n; i++) k *= i;
//            return k;
//        };
//        System.out.println(Factorial.func(4));
        String inStr = "What a beautiful day";
        String outStr;
//        StringFunc ReplaceOf = (str) -> {
//            StringBuilder result = new StringBuilder();
//            for (int i = 0; i < str.length(); i++) if (str.charAt(i) == ' ') result.append(str.charAt(i));
//            return result.toString();
//        };
//        outStr = changeStr(ReplaceOf, inStr);
//        System.out.println(outStr + " ");

//        Function<String, String> ReplaceOf = (str) -> {
//            StringBuilder result = new StringBuilder();
//            for (int i = 0; i < str.length(); i++) {
//                if (str.charAt(i) == ' ') result.append(str.charAt(i));
//            }
//            return result.toString();
//        };
//        System.out.println(ReplaceOf.apply(inStr));
    }
}
