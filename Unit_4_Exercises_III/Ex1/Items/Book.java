package Second_Evaluation.Unit_4_Exercises_III.Ex1.Items;

public class Book extends Item {
    private int numPages;

    public Book(String code, String title, String author, int numPages){
        super(code, title, author);
        this.numPages=numPages;
    }

    public void show(){
        System.out.print("Book{ " );
        super.show();
        System.out.print("number of pages= "+this.numPages);
        System.out.print("}");
    }
}
