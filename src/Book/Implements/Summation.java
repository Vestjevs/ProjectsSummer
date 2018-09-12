package Book.Implements;

public class Summation {
    private int sum;

    <T extends Number> Summation(T arg) {
        sum = 0;
        for (int i = 0; i <= arg.intValue(); i++)
            sum += i;
    }

    Summation(Summation object) {
        sum = object.sum;
    }

    int getSum() {
        return sum;
    }

}
