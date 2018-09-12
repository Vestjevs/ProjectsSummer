package Book.MyInstanceOfApplets;

import java.applet.Applet;
import java.awt.*;
/*
 <applet code="Param" width=300 height=80>
   <param name=author value="Vest Jevs">
   <param name=purpose value="Demonstrate Parameters">
   <param name=version value=2>
  </applet>
*/

public class Param extends Applet {
    Component wheel = new TextArea();

    public void init() {
        wheel.setName("TestTextArea");

    }


    public void start() {
        String temp;

        add(wheel);
    }

    public void paint(Graphics graphics) {
//        graphics.drawString("Limit min & Vest Jevs", 10, 15);

    }
}
