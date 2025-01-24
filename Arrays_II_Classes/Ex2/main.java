package Second_Evaluation.Arrays_II_Classes.Ex2;

import Second_Evaluation.Classes.Parrot.Parrot;

public class main {
    public static void main(String[] args) {
        Parrot p1 = new Parrot('F', 10, "N", "red");
        Parrot p2 = new Parrot('M', 5, "S", "blue");
        Parrot p3 = new Parrot('F', 9, "W", "purple");
        Parrot p4 = new Parrot('M', 4, "S", "orange");
        Parrot p5 = new Parrot('F', 7, "N", "yellow");
        Parrot p6 = new Parrot('M', 3, "E", "green");

        Parrot[] array = new Parrot[3];
        array[0] = p1;
        array[1] = p2;
        array[2] = p3;
        Parrot[] array2 = new Parrot[3];
        array[0] = p4;
        array[1] = p5;
        array[2] = p6;

        Parrot[] array3=new Parrot[6];

        for(int i=0;i<array3.length;i++){
            System.out.print(array[i]+" ");
            System.out.print(array2[i]+" ");
        }
    }
}
