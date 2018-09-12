package Book.MyInstanceOfApplets;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class drawLineWithMouse extends Applet implements MouseMotionListener, MouseListener {

    int curX = 0, curY = 0; // текущие координаты
    int oldX = 0, oldY = 0; // старые координаты
    boolean draw;

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
        draw = false;
    }

    // Обработчик события щелчка мышью
    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }

    // Обработчик события нажатия кнопки мыши
    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        // сохранить координаты
        oldX = mouseEvent.getX();
        oldY = mouseEvent.getY();
        draw = true;
        repaint();
    }

    // Обработчик события отпускания кнопки мыши
    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        draw = false;

    }

    // Обработчик события наведения указателя на область элемента
    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    // Обработчик события выхода указателя за пределы области элемента

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
    }

    // Обработчик события перетаскивания указателя мыши
    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        // сохранить координаты
        curX = mouseEvent.getX();
        curY = mouseEvent.getY();
        repaint();
    }

    // Обработчик события перемещения указателя мыши
    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        // show status
        showStatus("Moving mouse at " + mouseEvent.getX() + ", " + mouseEvent.getY());
    }


    // Отобразить сообщение в окне аплета
    // в точке с текущими значениями X and Y
    public void paint(Graphics graphics) {
        
        if (draw) graphics.drawLine(oldX, oldY, curX, curY);

    }


}
