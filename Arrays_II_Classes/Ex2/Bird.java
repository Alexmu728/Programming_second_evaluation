package Second_Evaluation.Arrays_II_Classes.Ex2;

public class Bird {
     private char sex;
     private int age;
     private static int amount=0;
     private PersonalData names;

     public Bird(char sex, int age, PersonalData names){
        this.sex=sex;
        this.age=age;
        this.names=names;
        amount++;
    }

    public int getAge(){
         return this.age;
    }
    public void setAge(){
         this.age=age;
    }

    public char getSex(){
         return this.sex;
    }
    public void setSex(){
         this.sex=sex;
    }

    public PersonalData getNames(){
         return this.names;
    }

    public void setNames(PersonalData names){
         this.names=names;
    }
    public int NumberOfBirds(){

         return amount;
    }
    public void WhoAmI(){

         System.out.println("Bird[ Sex: "+this.sex+", age: "+this.age+" ]");
    }

    public void sing() {
         String name= this.getNames().getName();
         System.out.println("My name is "+name+". Pio-pio I'm a bird");
    }

    public void getWhoAmI(){


    }
}
