package Book.MyInstanceOfApplets;

import java.applet.Applet;
import java.awt.*;


public class SimpleApplet extends Applet {


    public void paint(Graphics q) {
        q.drawString("Java makes applets", 100, 100);
    }
}
