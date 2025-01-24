package Second_Evaluation.Classes.Classes_VII;

import Second_Evaluation.Classes.Classes_VI.Point;
public class Straight {
    private float width;
    private Point p1;
    private Point p2;

    public Straight(float width, Point p1, Point p2) {
        this.width = width;
        this.p1 = p1;
        this.p2 = p2;
    }

    public Straight(float width, float x1, float x2, float y1, float y2) {
        this.width = width;
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    public boolean isHorizontal() {
        if (this.p1.getX() == this.p2.getX()) {
            return true;
        }
        return false;
    }

    public boolean isVertical() {
        if (this.p1.getY() == this.p2.getY()) {
            return true;
        }
        return false;
    }

    public Point highestPoint() {
        if (this.p1.getY() > this.p2.getY()) {
            return this.p1;
        }
        return this.p2;
    }

    public double length() {
        double x = Math.abs(this.p1.getX() - this.p2.getX());
        double y = Math.abs(this.p1.getY() - this.p2.getY());
        double result = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return result;
    }

    public Straight longest(Straight s) {
        if (this.length() > s.length()) {
            return this;
        }
        return s;
    }

    public void show() {
        System.out.println("Straight[width: " + this.width);
        this.p1.print();
        this.p2.print();
    }
}
