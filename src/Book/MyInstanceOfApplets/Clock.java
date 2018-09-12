package Book.MyInstanceOfApplets;

import java.applet.Applet;
import java.awt.*;
import java.util.Calendar;


public class Clock extends Applet implements Runnable {
    String msg;
    Thread t;
    boolean stopPoint;
    Calendar clock;

    public void init() {
        t = null;
        msg = "";
    }


    public void start() {
        t = new Thread(this);
        stopPoint = false;
        t.start();
    }

    @Override
    public void run() {
        for (; ; ) {
            try {
                repaint();
                Thread.sleep(1000);
                if (stopPoint) break;
            } catch (InterruptedException e) {
//            e.printStackTrace();
            }
        }
    }

    public void stop() {
        stopPoint = true;
        t = null;
    }

    public void paint(Graphics graphics) {
        clock = Calendar.getInstance();

        msg = "Текущее время: " + Integer.toString(clock.get(Calendar.HOUR));

        msg = msg + ":" + Integer.toString(clock.get(Calendar.MINUTE));

        msg = msg + ":" + Integer.toString(clock.get(Calendar.SECOND));

        graphics.drawString(msg, 30, 30);
    }
}
