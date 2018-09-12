package Book.Implements;

public class UseMain {
    public static void main(String[] args) {
        Thread thrd;

        //Получить основной поток
        thrd = Thread.currentThread();

        //Имя основного потока
        System.out.println("Имя основного потока: " + thrd.getName());

        //Приоритет основного потока
        System.out.println("Priority: " + thrd.getPriority());

        System.out.println();

        //Set name and priority main thread
        System.out.println("Installation name and priority\n");
        thrd.setName("Thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY + 3);

        System.out.println("New name main thread: " + thrd.getName());

        System.out.println("New value of priority: " + thrd.getPriority());
    }
}
