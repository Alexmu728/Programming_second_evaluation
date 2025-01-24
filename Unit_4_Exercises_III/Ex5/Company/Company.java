package Second_Evaluation.Unit_4_Exercises_III.Ex5.Company;

public class Company {
    private String nameCompany;
    private float profit;
    private Employee owner;
    private Employee manager;

    public Company(String nameCompany, float profit, Employee owner){
        this.nameCompany=nameCompany;
        this.profit=profit;
        this.owner=owner;
        this.manager=null;
    }

    public void hireManager(Employee e){
        this.manager=e;
    }

    public void work(){
        this.manager.work();
        this.owner.work();
        this.profit+=100;
    }

    @Override
    public String toString(){
        return this.nameCompany+" "+this.profit+" "+this.owner.toString()+" "+this.manager.toString();
    }

}


