package Book.Implements;

public class NonIntResultException extends Exception {
    int n, d;

    NonIntResultException(int i, int j) {
        n = i;
        d = j;
    }

    public String toString() {
        return "Результат операции " + n + " / " + d + " не является целым числом";
    }


}
