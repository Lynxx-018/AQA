import java.awt.Color;

class Triangle implements Shape {
    private double a, b, c;
    private Color fillColor;
    private Color borderColor;

public Triangle(double a, double b, double c, Color fillColor, Color borderColor) {
    this.a = a;
    this.b = b;
    this.c = c;
    this.fillColor = fillColor;
    this.borderColor = borderColor;
}

@Override
public double getArea() {
    double p = getPerimeter() / 2;
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
}

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public Color getFillColor() {
        return fillColor;
    }

    @Override
    public Color getBorderColor() {
        return borderColor;
    }
}

