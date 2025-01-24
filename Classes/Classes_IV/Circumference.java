package Second_Evaluation.Classes.Classes_IV;

public class Circumference {
    private float radius;
    private String color;
    public Circumference(float radius, String color){
        this.radius=radius;
        this.color=color;
    }
    public float area(){
        return (float)Math.PI*this.radius*this.radius;
    }
    public void printPerimeter(){
        float res=2*(float)Math.PI*this.radius;
        System.out.println("Perimenter: "+res);
    }
    public boolean isBig(){
        if(area()>20){
            return true;
        }
        return false;
    }
    public boolean isEqualTo(Circumference c){
        if(c.radius==this.radius && c.color.equals(this.color)){
            return true;
        }
        return false;
    }
    public void show(){
        System.out.println("Circumference: [radius: "+this.radius +", color: "+this.color);
    }
}
