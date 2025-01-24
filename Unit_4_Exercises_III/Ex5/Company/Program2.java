package Second_Evaluation.Unit_4_Exercises_III.Ex5.Company;

public class Program2 {
    public static void main(String[] args) {
        Company c1=new Company("Game", 1234f,
                new Employee("Maria", "1242354f",
                        123, 45, 400f,
                        new MobilePhone("235436",
                                36)));

        c1.hireManager(new Employee("Juan", "134534456g", 123, 57, 345f, new MobilePhone("423452346", 56)));

        System.out.println(c1.toString());
        c1.work();
        c1.work();
        System.out.println(c1.toString());
    }
}
