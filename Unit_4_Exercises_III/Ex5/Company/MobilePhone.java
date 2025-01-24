package Second_Evaluation.Unit_4_Exercises_III.Ex5.Company;

public class MobilePhone {
    private String number;
    private int battery;

    public MobilePhone(String number, int battery){
        this.number=number;
        this.battery=battery;
    }
    public int getBattery(){
        return this.battery;
    }

    public void setBattery(int battery){
        this.battery=battery;
    }

    public void use(){
        if(this.battery>0){
            this.battery--;
        }
    }


}
