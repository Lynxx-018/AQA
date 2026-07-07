import java.awt.*;

public class Main {
    static void main(String[] args) {
        Shape circle = new Circle(5.0, Color.RED, Color.BLACK);
        Shape rectangle = new Rectangle(4.0, 6.0, Color.BLUE, Color.GRAY);
        Shape triangle = new Triangle(3.0, 4.0, 5.0, Color.CYAN, Color.ORANGE);

        circle.printCharacteristics("Круг");
        rectangle.printCharacteristics("Прямоугольник");
        triangle.printCharacteristics("Треугольник");
    }
}