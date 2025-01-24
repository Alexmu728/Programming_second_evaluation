package Second_Evaluation.Array_Classes.Ex1;

import java.util.Scanner;

public class OpArray {
    private int[] array;

    public OpArray(){
        array=new int[100000];
    }

    public void loadArray(){
        Scanner sc=new Scanner(System.in);
        int count=0;
        int num=sc.nextInt();
            while(num!=0) {
                this.array[count]=num;
                count++;
                num=sc.nextInt();
            }
            int[] array2=new int[count];
            for(int i=0;i<count;i++){
                array2[i]=this.array[i];
            }
            this.array=array2;
            sc.close();
        }


    public void display(){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+" ");
        }
        System.out.println();
    }
    public int replace(int number){
        int count=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<this.array.length;i++){
            if(this.array[i]==number){
                System.out.println("Which number you want to replace it with?");
                this.array[i]=sc.nextInt();
                count++;
            }
        }
        sc.close();
        return count;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.array.length; i++) {
            s += this.array.length;
        }
        return s;
    }

    public int indexPrime(){
        int index= -1;
        boolean isPrime=true;

        for(int i=0;i<this.array.length;i++){
            isPrime=true;
            for(int j=2;j<this.array[i]-1;j++){
                if(this.array[i]%j==0){
                    isPrime=false;
                    return i;
                }
            }
            if(isPrime){

            }
        }
        return index;
    }

}
