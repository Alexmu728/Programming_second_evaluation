package Second_Evaluation.Unit_3_Exercises_II.PalindromicNumber;

public class PalindromicNumber {
    private long number;

    public PalindromicNumber(){
        this.number=(long)Math.random()*1000;
    }

    public PalindromicNumber(long number){
        this.number=number;
    }

    public long getNumber(){
        return this.number;
    }

    /*public boolean isPalindromic(){
        int N=countDigits(this.number);
        boolean isPalindomic=true;
        //if(N%2==0){
            if(int i=1;i<=N/2;i++){
                if (digitAtPosition(i) != digitAtPosition(N - i - 1)) {
                    isPalindomic=false;
                }
            }
        //}else{
        /*int i=1;
            while(i<=N){
                if (digitAtPosition(i) != digitAtPosition(N - i - 1)) {
                    isPalindomic=false;
                }
                i++;
            }
        return isPalindomic;
    }*/


}
