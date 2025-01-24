package Second_Evaluation.Classes.Parrot;

public class Main {
    public static void main(String[] args) {


        int N=3;

        Parrot[] pa1= new Parrot[N];
        Parrot[] pa2= new Parrot[N];

        pa1[0] = new Parrot('m', 4, "Europe", "Blue");
        pa1[1] = new Parrot('f', 2, "Asia", "Red");
        pa1[2] = new Parrot('m', 8, "Europe", "Yellow");

        pa2[0] = new Parrot('f', 5, "Africa", "Pink");
        pa2[1] = new Parrot('f', 10, "America", "Brown");
        pa2[2] = new Parrot('m', 3, "Europe", "Gray");

        Parrot[] pa3= new Parrot[N*2];

        for(int i=0; i<pa1.length;i++){
            pa3[i+2]=pa1[i];
            pa3[i*2+1]=pa2[i];
        }

        for(int i=0;i<pa3.length;i++){
            pa3[i].sing();
        }

        for (int i=0;i<pa3.length;i++){
            if(pa3[i].getRegion().equals("Europe")){
                pa3[i].sing();
            }
        }
    }
}