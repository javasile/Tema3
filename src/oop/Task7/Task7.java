package oop.Task7;

public class Task7 {

    public static void main(String[] args) {
        CircleGeometricObject dimension = new CircleGeometricObject(25);
        System.out.println(dimension);
        System.out.println(dimension.getArea());
        System.out.println(dimension.getPerimeter());

        ResizableCircle dim2 = new ResizableCircle(40);
        System.out.println(dim2);
        dim2.resize(30);
        System.out.println(dim2);

    }
}
interface GeometricObject {

    double getPerimeter();
    double getArea();

}

class CircleGeometricObject implements GeometricObject{

    private float radius;

    public CircleGeometricObject(float radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}


interface Resizable{
    void resize(int percent);
}


class ResizableCircle extends CircleGeometricObject implements Resizable{

    private float radius;

    public ResizableCircle(float radius) {
        super(radius);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public void resize(int percent) {
        radius = radius * percent /100;
    }

    @Override
    public String toString() {
        return "ResizableCircle{" +
                "radius=" + radius +
                '}';
    }
}


