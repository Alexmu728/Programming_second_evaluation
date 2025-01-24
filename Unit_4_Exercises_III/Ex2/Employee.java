package Second_Evaluation.Unit_4_Exercises_III.Ex2;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String ssn;

    public Employee(String firstName, String lastName, String ssn){
        this.firstName=firstName;
        this.lastName=lastName;
        this.ssn=ssn;
    }
    public abstract float earning();

    public String toString(){
        return this.firstName+" "+this.lastName+" "+this.ssn;
    }
}
