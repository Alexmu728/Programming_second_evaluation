package Second_Evaluation.Unit_4_Exercises_III.Ex5.Company;

public class Program {
    public static void main(String[] args) {
        MobilePhone m1= new MobilePhone("112312312", 23);
        Employee e1=new Employee("Alex", "245356fd", 189, 70, 100f, m1);

        System.out.println(e1.toString());
        e1.work();
        e1.work();
        System.out.println(e1.toString());
    }
}
