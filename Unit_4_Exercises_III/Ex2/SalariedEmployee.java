package Second_Evaluation.Unit_4_Exercises_III.Ex2;

public class SalariedEmployee extends Employee implements Payable{

    private float weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssn, float weeklySalary){
        super(firstName, lastName, ssn);
        if(weeklySalary<0) {
            this.weeklySalary = 0;
        }else{
            this.weeklySalary=weeklySalary;
        }
    }

    @Override
    public float earning(){
        return this.weeklySalary*4;
    }
    @Override
    public String toString(){
        return super.toString()+ " "+ weeklySalary;
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }
}
