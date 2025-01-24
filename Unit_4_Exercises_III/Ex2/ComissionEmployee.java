package Second_Evaluation.Unit_4_Exercises_III.Ex2;

public class ComissionEmployee extends Employee{
    private float grossales;
    private float rate;

    public ComissionEmployee(String firstName, String lastName, String ssn, float grossales, float commisionrate){
        super(firstName, lastName, ssn);
        if(commisionrate<0||commisionrate>=1){
            this.rate=0;
        }else{
            this.rate=commisionrate;
            this.rate=commisionrate;
        }
        this.grossales=grossales;
    }


    @Override
    public float earning() {
        return 0;
    }

    @Override
    public String toString(){
        return super.toString()+ " "+ this.rate+" "+this.grossales;
    }
}
