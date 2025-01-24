package Second_Evaluation.Unit_4_Exercises_III.Ex3;

public class Bird {
     char sex;
     int age;
     static int amount=0;

    public Bird(char sex, int age){
        this.sex=sex;
        this.age=age;
        amount++;
    }

    public int NumberOfBirds(){
        return amount;
    }
    public void WhoAmI(){
        System.out.println("Bird[ Sex: "+this.sex+", age: "+this.age+" ]");
    }
}
