package Book.Implements;

import Book.Interfaces.IQueue;
import Book.Interfaces.Series;

import java.util.Arrays;
import java.util.stream.IntStream;


public class ContestMain {


    /*int Summ(int... v) {
        int sum = 0;
        for (int i = 0; i < v.length; i++)
            sum += v[i];
        return sum;
    }

    int t;

    void swap(int ob1, int ob2) {

        t = ob1;
        ob1 = ob2;
        ob2 = t;
    }*/

    public static void main(String[] args) {
      /*  FailSortArray fs = new FailSortArray(5, -1);
        int x;

        System.err.println("Обработка ошибок без вывода отчета");
        for (int i = 0; i < (fs.length * 2); i++)
            fs.put(i, i * 10);
        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.err.print(x + " ");
        }
        System.err.println("");
        // Обработать ошибки
        System.err.println("\nОбработка ошибок с выводом отчета.");
        for (int i = 0; i < (fs.length * 2); i++)
            if (!fs.put(i, i * 10))
                System.err.println("Index " + i + " внедопустимого значения");
        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.err.print(x + " ");
            else System.err.println("Index " + i + " внедопустимого значения");
        }*/
  /*      Queue queue = new Queue(10);
        for (int i = 0; i < 10; i++) {
            queue.add(i + 256 * i);
        }
        System.err.println(queue.sizeof());
        System.err.println();
        for (int i = 0; i < 10; i ++){
            System.err.println(queue.get());
        }
*/
        //  System.err.println(queue.sizeof());
   /*     Block block1 = new Block(10, 2, 5);
        Block block2 = new Block(10, 2, 5);
        Block block3 = new Block(4, 5, 5);

        System.err.println("block1 имеет те же размеры, что и block2: " + block1.sameBlock(block2));
        System.err.println("block1 имеет те же размеры, что и block3: " + block1.sameBlock(block3));
        System.err.println("block1 имеет те же объем, что и block2: " + block1.sameVolume(block2));
   */
       /* Error.ErrInfo error = new Error.ErrInfo();
        Error e;

        e = error.getErrorInfo(2);
        System.out.println(e.msg + " уровень: " + e.severity);

        e = error.getErrorInfo(19);
        System.out.println(e.msg + " уровень: " + e.severity);*/
       /* Overload object = new Overload();
        int resI;
        double resD;

        object.ovlDemo();
        System.err.println();

        object.OvlDemo(2);
        System.err.println();

        resI = object.ovlDemp(4, 6);
        System.err.println("Result of calling object.ovlDemp(4,6): " + resI);
        System.err.println();

        resD = object.ovlDemo(1.1, 2.32);
        System.err.println("Result of calling object.ovlDemo(1.1, 2.32 ): " + resD);
        System.err.println("Сигнатура - имя метода и список его параметров");*/

   /*     Queue queue1 = new Queue(10);

        char[] name = {'T', 'o', 'm'};
        Queue queue2 = new Queue(name);

        char ch;


        for (int i = 0; i < 10; i++)
            queue1.add((char) ('A' + i));

        Queue queue3 = new Queue(queue1);
        for (int i = 0; i < 10; i++) {
            ch = queue1.get();
            System.out.print(ch);
        }
        System.out.println("\n");
        for (int i = 0; i < 3; i++) {
            ch = queue2.get();
            System.out.print(ch);
        }
        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            ch = queue3.get();
            System.out.print(ch);
        }
*/

/*

        System.out.println("Значениие val: " + StaticMath.val);
        System.out.println("StaticMath.valDiv2(): " + StaticMath.valDiv2());

        StaticMath.val = 4;

        System.out.println("Значениие val: " + StaticMath.val);
        System.out.println("StaticMath.valDiv2(): " + StaticMath.valDiv2());
*/


     /* StaticBlock staticBlock = new StaticBlock("Inside of constructor");
       System.out.println(StaticBlock.rootOf2);
       System.out.println(StaticBlock.rootOf3);*/


      /*  int[] x = {3, 2, 1, 5, 6, 9, 7, 8};
        Outer outer = new Outer(x);

        outer.Analyze();*/


        /*ContestMain contestMain = new ContestMain();
        System.out.println(contestMain.Summ(1, 23, 1, 4));

        int a = 2, b = 3;
        System.out.println(a + " " + b);

        contestMain.swap(a, b);

        System.out.println(a + " " + b);
*/

   /*   Backwords backwords = new Backwords("arraycopy");

      backwords.backword(0);
  */


    /*    ColorTriangle t1 = new ColorTriangle("Blue ", "контурный", 8.0, 12.0);
        ColorTriangle t2 = new ColorTriangle("Red ", "закрашенный", 2.0, 2.0);

        System.out.println("Information t1: ");
        t1.showDim();
        t1.showColor();

        System.out.println("Area - " + t1.area());

        System.out.println();

        System.out.println("Information t2: ");
        t2.showDim();
        t2.showColor();
        System.out.println("Area - " + t2.area());
*/
  /*      Triangle triangle1 = new Triangle("contour", 8.0, 12.0);
        Triangle triangle2 = new Triangle(triangle1);

        System.out.println("Information t1: ");
        triangle1.showDim();
        triangle1.showStyle();

        System.out.println("Area - " + triangle1.area());

        System.out.println();
        System.out.println("Information t2: ");

        triangle2.showDim();
        triangle2.showStyle();

        System.out.println("Area - " + triangle2.area());

*/
      /*  TwoDShape[] shapes = new TwoDShape[4];
        shapes[0] = new Triangle("contour", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10,4);
        shapes[3] = new Circle(3);



        for (int i = 0; i < shapes.length; i++) {
            System.err.println("Area - " + shapes[i].area());
            //  System.err.println(" - " + shapes[i]);
            System.err.println();
        }*/

   /*     ErrorMsg err = new ErrorMsg();
        System.out.println(err.getErrorMsg(err.OUTER));
        System.out.println(err.getErrorMsg(err.DISKER));
*/


        FixedQueueImpl queue1 = new FixedQueueImpl(10);
//        DymanicQueueImpl queue2 = new DymanicQueueImpl(5);
//        CircularQueueImpl queue3 = new CircularQueueImpl(10);

        IQueue iQueue;
        char ch;
        int i;
    /*    iQueue = queue1;
        for (i = 0; i < 10; i++) {
            iQueue.put((char) ('A' + i));
        }

        System.out.println("Содержимое очереди с фиксированным количеством");
        for (i = 0; i < 10; i++) {
            ch = iQueue.get();
            System.out.print(ch);
        }
        System.out.println();*/

    /* iQueue = queue3;
        for (i = 0; i < 10; i++) {
            iQueue.put((char) ('A' + i));
        }
        System.out.println("Содрежимое кольцевой очереди");
        for (i = 0; i < 10; i++) {
            ch = iQueue.get();
            System.out.print(ch);
        }
        System.out.println();

        // Поместить больше символов в кольцевую очередь
        for (i = 10; i < 20; i++) {
            iQueue.put((char) ('A' + i));
        }
        // Отобразить содержимое очереди
        System.out.println("Содрежимое кольцевой очереди");
        for (i = 0; i < 10; i++) {
            ch = iQueue.get();
            System.out.print(ch);
        }
        System.out.println("\nСохранение и использвание данных кольцевой очереди");

        // Поместить символы в кольцевую очередь и извлечь их оттуда
        for(i = 0; i < 20; i++){
            iQueue.put((char)('A' + i ));
            ch = iQueue.get();
            System.out.print(ch);
       }
       */
        //  iQueue = queue1;



    }


}
