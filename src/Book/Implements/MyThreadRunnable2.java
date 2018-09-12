package Book.Implements;

public class MyThreadRunnable2 implements Runnable {
    Thread thrd;

    volatile boolean suspended;
    volatile boolean stopped;

    MyThreadRunnable2(String name) {
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
        thrd.start();
    }

    // Точка входа в поток
    @Override
    public void run() {
        System.out.println(thrd.getName() + " - start");
        try {
            for (int i = 1; i < 1000; i++) {
                System.out.print(i + " ");
                if ((i % 10) == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }
                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                    if (stopped) break;
                }
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " - stopped");
        }
        System.out.println(thrd.getName() + " - exit");

    }

    //    Остановить паток
    synchronized void mystop() {
        stopped = true;
//        // Следующие операторы обеспечивают полную
//        // остановку приостановленного потока
        suspended = false;
        notify();

    }

    synchronized void mysuspend(){
        suspended = true;
    }

    synchronized void myresume(){
        suspended = false;
        notify();
    }
}
