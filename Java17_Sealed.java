
sealed class Shape permits Circle, Rectangle {}

final class Circle extends Shape {}
final class Rectangle extends Shape {}

public class Java17_Sealed {
    public static void main(String[] args) {
        Shape shape = new Circle();
        System.out.println("Shape is: " + shape.getClass().getSimpleName());
    }
}
