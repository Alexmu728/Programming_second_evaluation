package Second_Evaluation.Unit_4_Exercises_III.Ex5.Company;

public class Person {
    private String name;
    private String dni;
    private int height;
    private int weight;

    public Person(String name, String dni, int height, int weight){
        this.name=name;
        this.dni=dni;
        this.height=height;
        this.weight=weight;
    }

    public Person(String dni){
        this.name="";
        this.dni=dni;
        this.height=0;
        this.weight=0;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getWeight(){
        return this.weight;
    }

    public void setWeight(int weight){
        this.weight=weight;
    }

    public String toString(){
        return this.name+" "+this.weight;
    }
}
