package Second_Evaluation.Unit_3_Exercises_II.Ex1;

public class Main {
    public static void main(String[] args) {
        Person p1= new Person("Alex", 'm', 18);
        BankAccount b1= new BankAccount(p1);

        BankAccount b2=new BankAccount(new Person("Ferna", 'f', 18), 56.6f);

        b1.deposit(15f);

        b2.withdraw(100f);
        b2.withdraw(-40f);
        b2.withdraw(20f);

        b1.show();
        b2.show();

        /*BankAccount b1= new BankAccount("Alex");
        BankAccount b2= new BankAccount("Kevin", 56.6f);

        b1.deposit(15f);

        b2.withdraw(100f);
        b2.withdraw(-40f);
        b2.withdraw(20f);

        b1.show();
        b2.show();*/
    }
}
