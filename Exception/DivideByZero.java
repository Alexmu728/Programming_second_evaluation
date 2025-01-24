package Second_Evaluation.Exception;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input one number: ");
        int num=sc.nextInt();
        System.out.println("Input one number: ");
        int num2=sc.nextInt();


        try{
            if(num2<=0){
                throw new ArithmeticException();
            }
            double division=num/(double)num2;
        }catch(ArithmeticException ae) {
            System.err.println("Error: division by zero");
        }
        catch(Exception e){
            System.out.println("There was an error");
        }
    }
}
