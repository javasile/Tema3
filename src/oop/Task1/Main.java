package oop.Task1;

public class Main {

    public static void main(String[] args) {

        Point2D p2 = new Point2D();
        p2.setX(10.5F);
        p2.setY(15.5F);
        System.out.println("x" + p2.getX()+ " + y" + p2.getY() + " = " +(p2.getX() + p2.getY()));

        Point3D p3 = new Point3D();
        p3.setX(15.35F);
        p3.setY(12.32F);
        p3.setZ(13.25F);
        System.out.println("x" + p3.getX()+ " + y" + p3.getY() +" + z"+ p3.getZ() +  " = "+ (p3.getX() + p3.getY() + p3.getZ()));

    }
}
