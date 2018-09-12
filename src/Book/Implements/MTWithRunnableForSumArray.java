package Book.Implements;

public class MTWithRunnableForSumArray implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int[] a;
    int answer;

    //Create a thread
    MTWithRunnableForSumArray(String name, int[] nums) {
        thrd = new Thread(this, name);
        a = nums;
        thrd.start(); // start a thread

    }

    @Override
    public void run() {
        int sum;

        System.out.println(thrd.getName() + " -start");

        synchronized (sa){
            answer = sa.sumArray(a);
        }
        System.out.println("СУММА для " + thrd.getName() + ": " + answer);

        System.out.println(thrd.getName() + " - ending");

    }
}