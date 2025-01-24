package Second_Evaluation.Exception.Ex5;

public class Main {
    public static void main(String[] args)  {
        try {
            Cinema c = new Cinema("Alex", 5);
            c.addMovie(new Movie("Spiderman", 198, 2002));
            c.display();
        }catch (WrondDatadException e){
            System.out.println("Error");
        }

    }
}
