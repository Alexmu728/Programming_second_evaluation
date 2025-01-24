package Second_Evaluation.Classes.Classes_IV;

public class Main {
    public static void main(String[] args) {
        Circumference c1= new Circumference(1, "Red");
        Circumference c2= new Circumference(5, "Blue");
        Circumference c3= new Circumference(5, "Blue");

        c1.printPerimeter();
        c2.printPerimeter();

        if(c1.isBig()){
            System.out.println("C1 is big");
        }else{
            System.out.println("C1 is not big");
        }

        if(c2.isBig()){
            System.out.println("C2 is big");
        }else{
            System.out.println("C2 is not big");
        }

        if(c1.isEqualTo(c2)){
            System.out.println("They are the same");
        }else{
            System.out.println("They are not the same");
        }

        if(c2.isEqualTo(c3)){
            System.out.println("They are the same");
        }else{
            System.out.println("They are not the same");
        }
        c3.show();
    }
}
