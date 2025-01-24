package Second_Evaluation.Classes.Parrot;

public class Parrot {
    private char sex;
    private int age;
    private String region;
    private String color;

    public Parrot(char sex, int age, String region, String color){
        this.sex=sex;
        this.age=age;
        this.region=region;
        this.color=color;
    }

    public String getRegion(){
        return this.region;
    };
    public int getAge(){
        return this.age;
    }
    public char getSex(){
        return this.sex;
    }
    public String getColor(){
        return this.color;
    }
    public void sing(){
        System.out.println("hello");
    }
    public void show(){
        System.out.print("Parrot[Sex: "+this.sex+" Age: "+this.age+" Region: "+this.region+" Color: "+this.color+"]");
    }
}
