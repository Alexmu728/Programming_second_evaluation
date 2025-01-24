package Second_Evaluation.Exception;

import java.util.Scanner;

public class SumNumbers {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input number of parameters: ");
        int parameters = sc.nextInt();
        int sum = 0;
        int notAdded=0;

        String number="";

            for (int i = 0; i < parameters; i++) {
                try {
                    number = sc.nextLine();
                    int number_int = Integer.parseInt(number);
                    sum = sum + number_int;
                }catch (NumberFormatException exception) {
                    notAdded++;
                    System.out.println(number + " cannot be addded");
                }
            }
        System.out.println("Final sum: "+sum);
        System.out.println("Number of parameter not added: "+notAdded);
    }
}
