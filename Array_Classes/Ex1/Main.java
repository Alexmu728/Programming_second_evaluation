package Second_Evaluation.Array_Classes.Ex1;

public class Main {
    public static void main(String[] args) {

        OpArray oa = new OpArray();
        OpArray oa2 = new OpArray();

        System.out.println("Input array 1:");
        oa.loadArray();
        System.out.println("Input array 2");
        oa2.loadArray();

        oa.display();
        oa2.display();

        oa.replace(3);
        oa.display();

        System.out.println();
    }
}
