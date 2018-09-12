package Book.Implements;

public class MainChapter13 extends GenericMethodDemo {
    public static void main(String[] args) {

        // Создание объекта типа Gen<Integer> и присвоить ссылку на него переменной iOb.
//      //
//        Gen<Integer> iOb = new Gen<>(88);
//
//        // Show type of data, uses by object iOb
//        iOb.showType();
//
//        int v = iOb.getOb();
//        System.err.println("value: " + v);
//
//        System.err.println();
//
//        Gen<String> strOb = new Gen<>("Testing of generalization");
//
//        strOb.showType();
//
//        String str = strOb.getOb();
//        System.err.println("value: " + str);
//        Gen<Character> str = new Gen<>(2);

//        TwoGen<Integer, String> tgObj = new TwoGen<>(88,"Generalizations");
//
//        tgObj.showTypes();
//
//        int v = tgObj.getOb1();
//        System.err.println("value: " + v);
//
//        String str = tgObj.getOb2();
//        System.err.println("value: " + str);
//
//        TwoGen<String, String> Obj2 = new TwoGen<>("A", "B");
//        System.err.println("value: " + Obj2.getOb1() + "\nvalue: " + Obj2.getOb2());

//        NumericFns<Integer> iOb = new NumericFns<>(6);
//        NumericFns<Double> dOb = new NumericFns<>(-6.0);
//        NumericFns<Long> lOb = new NumericFns<>(5L);
//
//        System.err.println("Сранение iOb and dOb");
//        if (iOb.absEqual(dOb))
//            System.err.println("Абсолютные значение совпадают.");
//        else
//            System.err.println("Абсолютные значение отличаются.");
//        System.err.println();
//
////        System.err.println("Значение lOb - " + lOb.getObject());
//
//        System.err.println("Сранение iOb and lOb");
//        if(iOb.absEqual(lOb))
//            System.err.println("Абсолютные значение совпадают.");
//        else
//            System.err.println("Абсолютные значение отличаются.");


//        GenericMethodDemo gmc = new GenericMethodDemo();
//
//        Integer[] nums1 = new Integer[5];
//        Integer[] nums2 = new Integer[5];
//
//        for (int i = 0; i < nums1.length; i++) {
//            nums1[i] = nums2[i] = i + 1;
//        }
//        if (gmc.arraysEqual(nums1, nums2)) System.err.println("nums1 equivalent nums2");
//        else System.err.println("nums1 !equivalent nums2");
//        Summation ob = new Summation(4.0);
//        System.out.println("Сумма целых чисел от 0 до 4.0 равна " + ob.getSum());
//
//        Integer[] x = {1, 2, 3};
//
//        MyClass1<Integer> ob = new MyClass1<>(x);
//
//        if (ob.contains(2))
//            System.out.println("2 contains в ob");
//        else
//            System.out.println("2 !contains в ob");
//        if(ob.contains(5))
//            System.out.println("5 contains в ob");
//        else
//            System.out.println("5 !contains в ob");
//
        Integer[] iStore = new Integer[10];
        GenQueue<Integer> genQueue = new GenQueue<>(iStore);

        Integer iVal;

        System.out.println("Демонстрации очереди чисел типа Integer");

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Добавление " + i + " в очередь genQueue");
                genQueue.put(i);
            }
        } catch (QueueFullException exc) {
            System.out.println();
        }
        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Получение следующего числа типа Integer из очереди genQueue: ");
                iVal = genQueue.get();
                System.out.println(iVal);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }

        GenQueue<Double> queue2 = new GenQueue<>(10);
        Double dVal;

        System.out.println();
        System.out.println("Демонстрация очереди чисел типа Double");

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Добавление " + (double) i / 2 + " в очередь queue2");
                queue2.put((double) i / 2);
            }

        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Получение следующего числа типа Double из очереди queue2: ");
                dVal = queue2.get();
                System.out.println(dVal);
            }
        } catch (QueueEmptyException e) {
            e.printStackTrace();
        }
    }
}
