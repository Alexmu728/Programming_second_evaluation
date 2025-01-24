package Second_Evaluation.Exercises_V_collections;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {

    public static void laod(int n, ArrayList<Integer> numbers){
        int i=1, count=0;

        while(count<10 && i<n){
            if(n%i==0){
                numbers.add(i);
                //System.out.println(i);
                count++;
            }
            i++;
        }
    }

    public static void display(List<Integer> List){
        for(Integer elem:List){
            System.out.print(elem+ " ");
        }
        System.out.println(" ");
    }

    public static void loadArray(List<Integer> numbers){
        int num=0;
        for(int i=0; i<20; i++){
            num=(int)(Math.random()*(100-(100))-100+1);
            numbers.add(num);
        }
    }

    public static void LoadArrayNoRepeated(List<Integer> numbers){
        int num, i=0;
        while(i<20){
            num=(int)(Math.random()*(11-(11))-11);
            if(!numbers.contains(num)){
                numbers.add(num);
                i++;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        int n=12345;
        laod(n,numbers);
        display(numbers);

        numbers.clear();
        System.out.println(numbers.size());

        loadArray(numbers);
        display(numbers);

        LoadArrayNoRepeated(numbers);
        display(numbers);
    }
}
