package Second_Evaluation.Classes.Classes_I;

public class Classes_I_main {
    public static void main(String[] args) {
        Classes_I p=new Classes_I(1.1, 13, "Banana");
        p.printProduct();
        p=new Classes_I(1, 6, "Apple");
        Classes_I p2= new Classes_I(1.1, 13, "Banana");

        if(p2.equals(p)){
            System.out.println("They are the SAME");
        }else{
            System.out.println("They are DIFFERENT");
        }

        int a=3;
        int a2=3;
    }
}
