package oop.Task1.raspuns;

public class Rezolvare {
    public static void main(String[] args) {
        Point2B point2B = new Point2B(10, 20);
        point2B.setxy(43, 65);
        System.out.println(point2B);

        Point3B point3B = new  Point3B(15.5f, 12.1f, 18.5f);
        point3B.setxyz(25.5f, 35.6f, 45.7f);
        System.out.println(point3B);
    }


}
class Point2B{
    protected float x, y;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Point2B(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getxy(){
        return new float[]{x, y};
    }

    public void setxy(float x, float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%f, %f)", x, y);
    }
}
class Point3B extends Point2B{
    private float z;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Point3B(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float[] getxyz(){
        return new float[]{x, y, z};

    }
    public void setxyz(float x, float y, float z){
        this.setxy(x, y);
        this.z = z;
    }
    @Override
    public String toString() {
        return String.format("(%f, %f, %f)", x, y, z);
    }
}
