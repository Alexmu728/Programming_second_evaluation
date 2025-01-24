package Second_Evaluation.Unit_4_Exercises_III.Ex2;

public class BasePlusComissionEmployee extends ComissionEmployee{
    private float baseSalary;

    public BasePlusComissionEmployee(String firstName, String lastName, String ssn, float grossales, float commisionrate, float baseSalary){
        super(firstName, lastName, ssn, grossales, commisionrate);
        if(this.baseSalary<0){
            this.baseSalary=0;
        }else{
            this.baseSalary=baseSalary;
        }
    }
    @Override
    public float earning(){
        return super.earning()+this.baseSalary;
    }

    @Override
    public String toString(){
        return super.toString()+" "+this.baseSalary;
    }
}
