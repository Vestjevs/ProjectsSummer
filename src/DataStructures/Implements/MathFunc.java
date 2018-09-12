package DataStructures.Implements;

public class MathFunc {
    private int calls;

    public int getCalls() {
        return calls;
    }

    public long factorial(int number) {
        calls++;
        if (number < 0) throw new IllegalArgumentException();

        long result = 1;
        if (number > 1) {
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
        }
        return result;
    }

    public int sum(int x1, int x2) {
        calls++;
        return x1 + x2;
    }
}
