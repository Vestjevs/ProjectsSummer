package Book.MyInstanceOfApplets;

import java.applet.Applet;
import java.awt.*;

public class AppletBody extends Applet {
    public void init() {
        // initializations
    }

//    Этот метод вызывается вторым после метоа init(). Он
//    вызывается также при каждом перезапуске аплетаю.

    public void start() {
        // start or resume implementation
    }

    public void stop() {
        // stop implementation
    }

    public void destroy() {
        //implementation ending operation
    }

//    Этот метод вызывается для обновления данных в окне аплета
    public void paint(Graphics g){
        // redrawing window of applet

    }
}