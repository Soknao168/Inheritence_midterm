public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        Square square = new Square(7.0, 8);
        System.out.println("\nSquare Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());
    }
}