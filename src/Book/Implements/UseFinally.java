package Book.Implements;

public class UseFinally {
    public static void genException(int what) {
        int t;
        int[] nums = new int[2];

        System.out.println("Получено: " + what);
        try {
            switch (what) {
                case 0:
                    t = 10 / what; //Сгенерировать ошибку деления на ноль
                    break;
                case 1:
                    nums[4] = 4; // Сгенерировать ошибку обращения к массиву
                    break;
                case 2:
                    return; // Возвратиться из блока try
            }

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException exc) {
            System.out.println("Попытка деление на ноль");
        } finally {
            System.out.println("Выход из блока try");
        }
    }
}
