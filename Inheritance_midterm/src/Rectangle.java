public class Rectangle {

    private double w;
    private double l;

    public Rectangle(double w,double l) {
        this.w=w;
        this.l=l;
    }

    public double getArea() {
        return w*l;
    }

    public double getPerimeter() {
        return 2*(w+l);
    }
}
