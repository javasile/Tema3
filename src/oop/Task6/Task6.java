package oop.Task6;

public class Task6 {
    public static void main(String[] args) {

        Movable movablePoint = new MovablePoint(10, 20, 2, 4);
        System.out.println(movablePoint);
        movablePoint.moveRight();
        movablePoint.moveUp();
        System.out.println(movablePoint);
        
        Movable movableCercle = new MovableCercle(50, 30, 5, 3, 6);
        System.out.println(movableCercle);
        movablePoint.moveLeft();
        movablePoint.moveDown();
        System.out.println(movableCercle);

    }
}
interface Movable{

    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();

}

class MovablePoint implements Movable {

    private int x, y;
    private int xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y+=ySpeed;
    }

    @Override
    public void moveDown() {
        y-=ySpeed;
    }

    @Override
    public void moveLeft() {
        x-=xSpeed;
    }

    @Override
    public void moveRight() {
        x+=xSpeed;
    }

    @Override
    public String toString() {
        return "MouvablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}

class MovableCercle implements Movable{

    private float radius;

    private MovablePoint movablePoint;

    public MovableCercle(int radius, int x, int y, int xSpeed, int ySpeed) {
        this.radius = radius;
        this.movablePoint = new  MovablePoint(x, y, xSpeed, ySpeed);
    }

    public MovableCercle(int radius, int x, int y, int xSpeed) {
    }

    @Override
    public void moveUp() {
        movablePoint.moveUp();
    }

    @Override
    public void moveDown() {
        movablePoint.moveDown();
    }

    @Override
    public void moveLeft() {
        movablePoint.moveLeft();
    }

    @Override
    public void moveRight() {
        movablePoint.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCercle{" +
                "radius=" + radius +
                ", movablePoint=" + movablePoint +
                '}';
    }

}



