package Book.MyInstanceOfApplets;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class MouseEvents extends Applet implements MouseListener, MouseMotionListener, MouseWheelListener {
    String msg = "";
    int mouseX = 0, mouseY = 0; // координаты указателя мыши

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);

    }

    // Обработчик события щелчка мышью
    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse clicked.";
        repaint();
    }

    // Обработчик события нажатия кнопки мыши
    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        // сохранить координаты
        mouseX = mouseEvent.getX();
        mouseY = mouseEvent.getY();
        msg = "Down";
        repaint();
    }

    // Обработчик события отпускания кнопки мыши
    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        // сохранить координаты
        mouseX = mouseEvent.getX();
        mouseY = mouseEvent.getY();
        msg = "Up";
        repaint();
    }

    // Обработчик события наведения указателя на область элемента
    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        mouseX = 0;
        mouseX = 10;
        msg = "Mouse entered.";
        repaint();

    }

    // Обработчик события выхода указателя за пределы области элемента

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        mouseX = 0;
        mouseX = 10;
        msg = "Mouse exited.";
        repaint();
    }

    // Обработчик события перетаскивания указателя мыши
    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        // сохранить координаты
        mouseX = mouseEvent.getX();
        mouseY = mouseEvent.getY();
        msg = "*";
        showStatus("Dragging mouse at " + mouseX + ", " + mouseY);
        repaint();
    }

    // Обработчик события перемещения указателя мыши
    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        // show status
        showStatus("Moving mouse at " + mouseEvent.getX() + ", " + mouseEvent.getY());
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent mouseWheelEvent) {

    }

    // Отобразить сообщение в окне аплета
    // в точке с текущими значениями X and Y
    public void paint(Graphics graphics) {
        graphics.drawString(msg, mouseX, mouseY);
    }


}
