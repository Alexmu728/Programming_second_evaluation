package Second_Evaluation.Classes.Classes_VI;

public class Point {
    private float x;
    private float y;
    public Point(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float getX(){
        return x;
    }

    public float getY() {
        return y;
    }

    public int quadrant(){
        if(this.x>0){
            if(this.y>0){
                return 1;
            }else{
            return 4;}
        }else{
            if(this.y>0){
                return 2;
            }
            return 3;
        }
    }
    public void print(){
       System.out.println("Point[x: "+this.x+" y: "+this.y+"]");

    }

}
