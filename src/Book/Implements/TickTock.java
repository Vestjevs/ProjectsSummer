package Book.Implements;

public class TickTock {
    String state;

    synchronized void tick(boolean running) {
        if (!running) { // stop o`clock
            state = "ticked";
            notify();
            return;
        }

        System.out.print("Tick ");
        try{
            Thread.sleep(500);
        } catch (InterruptedException exc) {
            System.out.println("Выполнение потока прервано");
        }
        state = "ticked"; // установить текущее состояние
//                        // после таккта "тик"
        notify();
        try {
            while (!state.equals("tocked"))
                wait(); // wait ending method tock()

        } catch (InterruptedException exc) {
            System.out.println("Прерывание потока");
        }
    }

    synchronized void tock(boolean running) {
        if (!running) {
            state = "tocked";
            notify();
            return;
        }
        System.out.println("Tock ");
        try {
            Thread.sleep(500);
        } catch (InterruptedException exc) {
            System.out.println("Выполнение потока прервано");
        }
        state = "tocked";

        notify();
        try {
            while (!state.equals("ticked"))
                wait();  // wait ending method tick()
        } catch (InterruptedException exc) {
            System.out.println("Прерывание потока");
        }
    }
}
