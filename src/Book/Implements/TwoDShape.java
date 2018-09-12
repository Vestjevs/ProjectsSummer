package Book.Implements;

public abstract class TwoDShape {
    private double width;
    private double height;
    private String name;
    private double radius;

    TwoDShape() {
        width = height = 0;
        name = "none";
    }

    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    TwoDShape(double x, String n) {
        name = n;
        width = height = radius = x;
    }

    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeigth(double h) {
        height = h;
    }

    void showDim() {
        System.out.println("Height d width - " + width + " d " + height);
    }

    abstract double area();

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
