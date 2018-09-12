package Book.Implements;

public class SumArray {
    private int sum;

    synchronized int sumArray(int[] nums) {
        sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Текущее значение суммы для " + Thread.currentThread().getName() + ": " + sum);
            try {
                Thread.sleep(10); // разрешить переключение задач

            } catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока");
            }

        }
        return sum;
    }
}
