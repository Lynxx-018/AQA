import java.awt.*;

interface Shape {
    double getArea();
    double getPerimeter();
    Color getFillColor();
    Color getBorderColor();

    default void printCharacteristics(String shapeName){
        System.out.println("=== " + shapeName + " ===");
        System.out.printf("Площадь: %.2f\n", getArea());
        System.out.printf("Периметр: %.2f\n", getPerimeter());
        System.out.println("Цвет заливки: " + getColorName(getFillColor()));
        System.out.println("Цвет границы: " + getColorName(getBorderColor()));
        System.out.println();
    }

    private String getColorName(Color color) {
        if (color == null) return "Не задан";
        if (color.equals(Color.RED)) return "Красный";
        if (color.equals(Color.BLUE)) return "Синий";
        if (color.equals(Color.ORANGE)) return "Оранжевый";
        if (color.equals(Color.CYAN)) return "Голубой";
        if (color.equals(Color.GRAY)) return "Серый";
        if (color.equals(Color.BLACK)) return "Черный";
        return "Пользовательский цвет (RGB: " + color.getRed() + "," +
                color.getGreen() + "," + color.getBlue() + ")";
    }
}