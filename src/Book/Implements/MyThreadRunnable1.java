package Book.Implements;

import java.util.stream.IntStream;

public class MyThreadRunnable1 implements Runnable {
    Thread thrd;
    TickTock ttOB;
    final int t;


    MyThreadRunnable1(String name, TickTock tt, int time) {
        thrd = new Thread(this, name);
        ttOB = tt;
        thrd.start();
        this.t = time;
    }

    @Override
    public void run() {
        if (thrd.getName().compareTo("Tick") == 0) {
            IntStream.range(0, t).forEachOrdered(i -> ttOB.tick(true));
            ttOB.tick(false);

        } else {
            IntStream.range(0, t).forEachOrdered(i -> ttOB.tock(true));
            ttOB.tock(false);
        }

    }
}
