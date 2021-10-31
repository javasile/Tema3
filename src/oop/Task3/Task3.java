package oop.Task3;

public class Task3 {
    public static void main(String[] args) {
        Shape shape = new Shape(false, "red");
        System.out.println(shape);

        Shape circle = new Circle(true, "blue", 20);
        System.out.println(circle);

        Shape square = new Square(true, "yellow", 21, 15);
        System.out.println(square);
    }

}
class Shape{

    private boolean isFilled;
    private String color;

    public Shape() {
        this.isFilled = false;
        this.color = "unknown";
    }

    public Shape(boolean isFilled, String color) {
        this.isFilled = isFilled;
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    @Override
//    public String toString() {
//        return "Shape{" +
//                "isFilled=" + isFilled +
//                ", color='" + color + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return String.format("Shape with color of %S and %S", color, isFilled ? "filld" : "NotFilled");
    }

}

class Circle extends Shape{

   private float radius;

    public Circle(boolean isFilled, String color, int radius) {
        super(isFilled, color);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public float getArea(){
        return (float) (Math.PI * radius * radius);
    }

    public float getPerimeter(){
        return (float) (2 * Math.PI * radius);
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("Circle whit radius=%f witch is subclass off %s", radius, super.toString());
    }
}
class Rectangle extends Shape{

    private double width, length;

    public Rectangle(boolean isFilled, String color, double width, double length) {
        super(isFilled, color);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public float getArea(){
        return (float) (width * length);
    }

    public float getPerimeter(){
        return (float) (2 * width + 2 * length);
    }

    @Override
    public String toString() {
        return String.format("Rectangle with width=%f and length=%f is subclass off %s", width, length, super.toString());
    }
}
class Square extends Rectangle{

    public Square(boolean isFilled, String color, double width, double length) {
        super(isFilled, color, width, length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return String.format("Square with=%f and length=%f witch is subclass off %s", getWidth(), getLength(), super.toString());
    }
}

