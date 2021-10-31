package oop.Task4;

public class Task4 {
    public static void main(String[] args) {
        ShapeEx4[] shapes = {
                new CircleEx4("blue", true, 20),
                new RectangleEx4("yellow", true, 20, 30),
                new SquareEx4("green", false, 40, 50)
        };
        for (ShapeEx4 shape : shapes){
            System.out.println(shape);
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
        }
    }


}

abstract class ShapeEx4{
    private String color;
    private boolean isFilled;

    public ShapeEx4() {
        this.color = "Unknown";
        this.isFilled = false;
    }

    public ShapeEx4(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public abstract float getArea();
    public abstract float getPerimeter();

    @Override
    public String toString() {
        return String.format("Shape with color of %s and %s", color, isFilled ? "filled" : "NotFilled");
    }
}

class CircleEx4 extends ShapeEx4{

    private float radius;

    public CircleEx4(String color, boolean isFilled, float radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public float getPerimeter() {
        return (float) (2 * Math.PI * radius);
    }

    @Override
    public String toString() {
        return String.format("Cercle with radius=%f wich is subclass off %s", radius, super.toString());

    }
}

class RectangleEx4 extends ShapeEx4{

    protected double width, length;

    public RectangleEx4(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
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

    @Override
    public float getArea() {
        return (float) (width * length);
    }

    @Override
    public float getPerimeter() {
        return (float) (2 * width + 2 * length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                "subclass off " + super.toString()+
                '}';
    }
}
class SquareEx4 extends RectangleEx4{

    public SquareEx4(String color, boolean isFilled, double width, double length) {
        super(color, isFilled, width, length);
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
        return "SquareEx4{" +
                "width=" + width +
                ", length=" + length +
                " subclass off " + super.toString()+
                '}';
    }
}

