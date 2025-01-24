package Second_Evaluation.Unit_3_Exercises_II.Ex1;

public class BankAccount {

    private Person person;
    //private String name;
    private float balance;
    private boolean isRed;

    public static int countBankAccounts=0;

    public BankAccount(//String name
                       Person person ){
        //this.name=name;
        this.person=person;
        this.balance=0f;
        this.isRed=false;
        countBankAccounts++;
    }

    public BankAccount(//String name,
                       Person person, float balance){
        //this.name=name;
        this.person=person;
        this.balance=balance;
        if(balance<0){
            this.isRed=true;
        }else{
            this.isRed=false;
        }
        countBankAccounts++;
    }

    public void deposit(float number){
        if(this.balance<0 && this.balance+number>0){
            this.isRed=false;
        }
        this.balance=this.balance+number;
    }

    public void withdraw(float amount){
        //if(this.balance-amount>0){
            if(amount>0) {
                if(this.balance>0 && this.balance-amount<0) {
                    this.isRed = true;
                }
                this.balance = this.balance - amount;
            }else{
                System.out.println("The number must be positive");
            //}
        //}else{
            //System.out.println("You do not have enough money to withdraw that number");
        }
    }

    public void show(){
        System.out.println("Bank account[name: "+this.person.toString()+", balance: "+this.balance+"]");
    }

}
