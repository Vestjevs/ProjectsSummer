package Book.Implements;



public class Circle extends TwoDShape {

    Circle() {
        super();
    }

    Circle(double R) {
        super(R, "circle");
    }
    Circle(Circle circle){
        super(circle);
    }

    @Override
    double area() {
        return 3.14 * getRadius() * getRadius();
    }
}
