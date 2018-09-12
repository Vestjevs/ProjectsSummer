package Book.MyInstanceOfApplets;
/*Простой аплет баннера.
 *
 * В этом аплете создается поток, управляющий прокруткой
 * текста сообщений, хранещегося в переменной msg,
 * справа налево в окне аплета.
 * */

import java.applet.Applet;
import java.awt.*;

public class Banner extends Applet implements Runnable {
    String msg, msg2;
    Thread t;
    boolean stopFlag;
    int tDelay;


    public void init() {
        t = null;
    }

    public void start() {
        t = new Thread(this);
        stopFlag = false;
        tDelay = 500;
        msg = "Java rules the Web ";
        msg2 = msg;
        t.start();
    }

    public void run() {
        for (; ; ) {
            try {
                repaint();
                Thread.sleep(tDelay);
                if (stopFlag)
                    break;
            } catch (InterruptedException exc) {
            }
        }
    }

    public void stop() {
        stopFlag = true;
        t = null;
    }

    public void paint(Graphics graphics) {
        char ch;
        graphics.drawString(msg2, 50, 20);
        ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg += ch;
        graphics.drawString(msg, 50, 50);

    }
}
