package Second_Evaluation.Exercises_V_collections.Ex2;

public class Points {
    private double x;
    private double y;

    public Points(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX(){return this.x;}
    public double getY(){return this.y;}

    @Override
    public String toString() {
        return "x: " + this.x + " y:" + this.y;
    }
}
