package Book.Implements;

public class ExcTest {
    static void genException() {
        int[] numer = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] deno = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + deno[i] + " equally " + numer[i] / deno[i]);

            } catch (ArithmeticException exc) {
                System.out.println("Trying div by zero");
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("The corresponding element was not found");
                throw exc;
            }


        }
    }
}
