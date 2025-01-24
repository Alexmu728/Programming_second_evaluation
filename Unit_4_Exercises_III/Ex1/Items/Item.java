package Second_Evaluation.Unit_4_Exercises_III.Ex1.Items;

public class Item {
    private String code;
    private String title;
    private String author;

    public Item(String code, String title, String author){
        this.code=code;
        this.title=title;
        this.author=author;
    }

    public void show(){
        System.out.println("Item[ author= "+this.author+" title= "+this.title+" code= "+this.code+" ]");
    }

}
