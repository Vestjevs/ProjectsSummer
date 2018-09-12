package Book.Implements;


public class MainChapter12 {
    public static void main(String[] args) {
        //
//        tp = Transport.AIRPLANE;
//
//        System.out.println("Value tp: " + tp);
//        System.out.println();
//
//        tp = Transport.TRAIN;
//
//        if (tp == Transport.TRAIN)
//            System.out.println("tp содержит TRAIN\n");
//
//        switch (tp) {
//            case CAR:
//                System.out.println("Автомобиль возит людей");
//                break;
//            case TRUCK:
//                System.out.println("Грузовик перевозит груз");
//                break;
//            case AIRPLANE:
//                System.out.println("Самолет летит");
//                break;
//            case TRAIN:
//                System.out.println("Поезд движется по рельсам");
//                break;
//            case BOAT:
//                System.out.println("Лодка плывет по воде");
//                break;
//        }
//        System.out.println(Arrays.toString(Transport.values()));

//        System.out.println("Constants type of Transport");
//
////        Transport transport[] = Transport.values();
//        for (Transport t : Transport.values())
//            System.out.println(t);
//
//        System.out.println();
//
//        tp = Transport.valueOf("AIRPLANE");
//        System.out.println("tp contains " + tp);
//        System.out.println("Типичная скорость самолета " + Transport.AIRPLANE.getSpeed() + " миль в час\n");
//
//        System.out.println("Типичные скорости движения транспортных средств");
//        Arrays.stream(Transport.values()).map(t -> t + ": " + t.getSpeed() + " миль в час").forEachOrdered(System.out::println);

//        Transport tp1, tp2, tp3;
//        System.out.println("Константы перечисления Transport и их порядковые значение: ");
//        Arrays.stream(Transport.values()).map(t -> t + ": " + t.ordinal()).forEachOrdered(System.out::println);
//
//        tp1 = Transport.AIRPLANE;
//        tp2 = Transport.TRAIN;
//        tp3 = Transport.AIRPLANE;
//
//        System.out.println();
//
//        if (tp1.compareTo(tp2) < 0)
//            System.out.println(tp1 + " идет перед " + tp2);
//        if ((tp1.compareTo(tp2)) > 0)
//            System.out.println(tp2 + "идет перед" + tp1);
//        if(tp1.compareTo(tp3) == 0)
//            System.out.println(tp1 + " совпадает с " + tp3 );

//        TrafficLightSimulator t1 = new TrafficLightSimulator();
//        for (int i = 0; i < 9; i++) {
//            System.out.println(t1.getColor());
//            t1.waitForChange();
//        }
//        t1.cancel();

//        Integer iOb = 100;
//        int i = iOb;
//
//        System.out.println(i + " " + iOb);
//        Integer iOb, iOb2;
//        int i;
//
//        iOb = 99;
//        System.out.println("Исходное значение iOb: " + iOb);
//        ++iOb;
//        System.out.println("После ++iOb :" + iOb);
//
//        iOb += 10;
//        System.out.println("После iOb += 10: " + iOb);
//
//        iOb2 = iOb + (iOb / 3);
//        System.out.println("iOb2 после вычисления выражения: " + iOb2);
//
//        i = iOb + (iOb / 3);
//        System.out.println("i после вычисления выражения: " + i);
//
//        iOb = 5;
//        switch (iOb) {
//            case 1:
//                System.out.println("one");
//                break;
//            case 2:
//                System.out.println("two");
//                break;
//            default:
//                System.out.println("error");
//        }
//
////         ThreadQuadratic threadQuadratic = new ThreadQuadratic("Нахождение корней:");
//            MyClassExampleAnnotation myClassExampleAnnotation = new MyClassExampleAnnotation("Test");
//            System.out.println(myClassExampleAnnotation.getMsg());
//      for(Tools d: Tools.values()){
//          System.out.println(d + " имеет порядковое значение " + d.ordinal() + '\n');
//      }

        ThreadQuadratic threadQuadratic = new ThreadQuadratic("Solve the Quadratic Equation");

        try {
            threadQuadratic.thrd.join();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
