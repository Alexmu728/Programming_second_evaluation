package Second_Evaluation.Unit_4_Exercises_III.Ex5.Company;

public class Employee extends Person{
    private float money;
    private MobilePhone mobile;

    public Employee(String name, String dni, int height, int weight, float money, MobilePhone mobile){
        super(name, dni, height,weight);
        this.money=money;
        this.mobile=mobile;
    }

    public Employee(String dni, float money){
        super(dni);
        this.money=money;
        this.mobile=null;
    }

    public void earnMoney(float money){
        this.money=this.money+money;
    }

    public void spendMoney(float money){
        this.money=this.money-money;
    }

    public void work(){
        this.mobile.use();
        this.money+=10;
    }


    @Override
    public String toString(){
        return this.getName()+" "+this.getWeight()+" "+this.money+" "+this.mobile.getBattery();
    }
}
