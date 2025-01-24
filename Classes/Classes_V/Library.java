package Second_Evaluation.Classes.Classes_V;

public class Library {
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }
    public static int digitAmount(int num){
        int c=num;
        int digit=1;
        while(c/10!=0){
            digit++;
            c=c/10;
        }
        return digit;
    }
    public static boolean isLong(int num){
        if(digitAmount(num)>5){
            return true;
        }
        return false;
    }
    public static boolean multipleof10(int num){
        if(num%10==0){
            return true;
        }
        return false;
    }
}
