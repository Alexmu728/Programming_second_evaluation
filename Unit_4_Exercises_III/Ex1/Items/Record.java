package Second_Evaluation.Unit_4_Exercises_III.Ex1.Items;

public class Record extends Item {
    private String[] discography;

    public Record(String code, String title, String autor, String[] discography){
        super(code, title, autor);
        this.discography=discography;
    }

    @Override


    public void show(){
        super.show();
        System.out.println("Discography: ");
        for(String elem:discography){
            System.out.print(elem+" ");
        }
        System.out.println();
    }
}
