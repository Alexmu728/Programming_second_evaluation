package Second_Evaluation.Unit_3_Exercises_II.Ex1;

public class Person {
    private String name;
    private char sex;
    private int age;

    public Person(String name, char sex, int age){
        this.name=name;
        this.sex=sex;
        this.age=age;
    }

    public void show(){
        System.out.println("Person[name: "+this.name+" age: "+this.age+" sex: "+this.sex+"]");
    }
}
