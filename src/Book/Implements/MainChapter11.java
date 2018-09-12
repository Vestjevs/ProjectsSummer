package Book.Implements;

public class MainChapter11 {
    public static void main(String[] args) {
//        System.out.println("Запуск основного потока");
//
//        //Сначала создать объект типа MyThreadWithImplementsRunnable
////        MyThreadWithExtendsThread myThread01 = new MyThreadWithExtendsThread("Child #1");
//        MyThreadWithImplementsRunnable myThread11 = new MyThreadWithImplementsRunnable("Child #1");
//        MyThreadWithImplementsRunnable myThread12 = new MyThreadWithImplementsRunnable("Child #2");
//        MyThreadWithImplementsRunnable myThread13 = new MyThreadWithImplementsRunnable("Child #3");


        //Затем сформировать поток на основе этого объекта
//        Thread newThrd = new Thread(myThread);
//
//        newThrd.start();

//        for (int i = 0; i < 50; i++) {
//            System.out.print(".");
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException exc) {
//                System.out.println("Прерывание основного потока");
//            }
//        }
//        System.out.println("Завершение основного потока");

//        do {
//            System.out.print(".");
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException exc) {
//                System.out.println("Прерывание основного потока");
//            }
//
//        } while (myThread11.thrd.isAlive() || myThread12.thrd.isAlive() || myThread13.thrd.isAlive());
//        System.out.println("Завершение основного потока");

//
//
//
//        int[] a = {1, 2, 3, 4, 5};
//        int[] b = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
//        MTWithRunnableForSumArray MTW1 = new MTWithRunnableForSumArray("Child #1", a);
//        MTWithRunnableForSumArray MTW2 = new MTWithRunnableForSumArray("Child #2", a);

        TickTock tt = new TickTock();
        MyThreadRunnable1 mt1 = new MyThreadRunnable1("Tick", tt, 60);
        MyThreadRunnable1 mt2 = new MyThreadRunnable1("Tock", tt, 60);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.print("Прерывание основго потока");
        }

//        MyThreadRunnable2 myThreadRunnable2 = new MyThreadRunnable2("My Thread");
//
//        try {
//            Thread.sleep(1000); // позволить потоку myThreadRunnable2
//
//            myThreadRunnable2.mysuspend();
//            System.out.println("Suspended a thread");
//            Thread.sleep(1000);
//
//            myThreadRunnable2.myresume();
//            System.out.println("Resume a thread");
//            Thread.sleep(1000);
//
//            myThreadRunnable2.mysuspend();
//            System.out.println("Suspended a thread");
//            Thread.sleep(1000);
//
//            myThreadRunnable2.myresume();
//            System.out.println("Resume a thread");
//            Thread.sleep(1000);
//
//            myThreadRunnable2.mysuspend();
//            System.out.println("Stopped a thread");
//            myThreadRunnable2.mystop();
//        } catch (InterruptedException exc){
//            System.out.println("Прерывание основного потока");
//        }
//        try {
//            myThreadRunnable2.thrd.join();
//        } catch (InterruptedException exc) {
//              System.out.println("Прерывание основного потока");
//        }
//        System.out.println("Выход из основного потока");
    }
}
