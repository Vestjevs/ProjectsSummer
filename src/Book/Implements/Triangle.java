package Book.Implements;

public class Triangle extends TwoDShape {
    private String style;


    Triangle() {
        super();
        style = "none";
    }

    Triangle(double x) {
        super(x,"triangle");
        style = "dirty";
    }

    Triangle(String s, double w, double h) {
        super(w, h, "triangle");
        style = s;

    }

    Triangle(Triangle ob) {
        super(ob);
        style = ob.style;
    }

    double area() {
        return getHeight() * getWidth() / 2;
    }

    void showStyle() {
        System.out.println("Triangle " + style);
    }

}
