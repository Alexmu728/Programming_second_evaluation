package Second_Evaluation.Streams_And_Files_Ex3;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private float salary;
    private MobilePhone mobilephone;

    public Employee(String name, float salary, MobilePhone mobilephone){
        this.name=name;
        this.salary=salary;
        this.mobilephone=mobilephone;
    }

    public void display(){
        System.out.println("Name: "+this.name+" Salary: "+this.salary);
        this.mobilephone.display();

    }
    public void work(){
            this.salary+=10;
            this.mobilephone.call(15);
    }

    public void work(float g, int m){
        this.salary+=g;
        this.mobilephone.call(m);
    }

    public String getName(){
        return this.name;
    }
}
