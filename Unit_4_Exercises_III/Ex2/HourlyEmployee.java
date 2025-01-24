package Second_Evaluation.Unit_4_Exercises_III.Ex2;

public class HourlyEmployee extends Employee implements Payable{
    private float wagehour;
    private int hours;

    public HourlyEmployee(String firstName, String lastName, String ssn, float wagehour, int hours){
        super(firstName, lastName, ssn);
        if(wagehour<0){
            this.wagehour=0;
        }else{
            this.wagehour=0;
        }
        if(hours<0){
            this.hours=0;
        }else{
            this.hours=hours;
        }
    }

    @Override
    public float earning() {
        if(this.hours>40){
            return this.wagehour*1.5f*this.hours;
        }else{
            return this.wagehour*this.hours;
        }
    }

    @Override
    public double getPaymentAmount() {
        return earning()*12;
    }
}
