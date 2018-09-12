package Book.Implements;

public class MainChapter9 {
    //
//     * try{
//     * блок кода, в котором должны отслеживаться ошибк
//     * и}
//     *
//     * catch(тип_исключения_1 объект_исключения){
//     * //обработчик исключения тип_исключние_1
//     * }
//     *
//     * catch(тип_исключения_1 объект_исключения){
//     * //обработчик исключения тип_исключние_2
//     * }
//     * //...
//     *
//     * finally(
//     *   //код блока finally )
//     *
//    возвращаемый_тип имя_метода(список_параметров) throws
//            список_исключений{
//        тело метода
//    }

    //
    public static void main(String[] args) {
/*
        try {
            ExcTest.genException();

        } catch (ArithmeticException exc) {
            System.out.println("Index out of Bounds");
        }
        System.out.println("After catch operator");

        System.out.println("After block try/catch");
        int[] nums = new int[4];
        System.out.println("До генерации исключения");
        nums[4] = 10;
*/


//        try {
//            ExcTest.genException();
//        } catch (ArrayIndexOutOfBoundsException exc) {
//            System.out.println("Standart message");
//            System.out.println(exc);
//            System.out.println("\nStack call");
//            exc.printStackTrace();
//        }

//        System.out.println("After operator catch");
       /* try {
            System.out.println("Before operator throw");
            throw new ArithmeticException();
        } catch (ArithmeticException exc) {
            System.out.println("Exception is intercepted");
        }*/
        /*for (int i = 0; i < 3; i++) {
            UseFinally.genException(i);
            System.out.println();
      }*/

//        Stack queue = new Stack(10);
//        char ch;
//        int i;
//
//        try {
//            for (i = 0; i < 11; i++) {
//                System.out.print("Попытка сохранения: " + (char) ('A' + i));
//                queue.push((char) ('A' + i));
//                System.out.println(" - OK");
//
//            }
//        } catch (StackFullException e) {
//            System.out.println(e);
//        }
//        System.out.println();
//        try {
//            for (i = 0; i < 11; i++) {
//                System.out.print("Получение очередного символа: ");
//
//                System.out.println(queue.pop());
//            }
//        } catch (StackEmptyException e) {
//            System.out.println(e);
//        }
    }
}

