package Second_Evaluation.Classes.Classes_II;

public class Multiplier {

    //Attribute
    private int number;

    //Constructor
    public Multiplier(int number){
        this.number=number;
    }

    //Getters and Setters
    public int getNumber(){
        return this.number;
    }

    //Methods
    int multiply(int otherNumber){

        return this.number*otherNumber;
    }
}
