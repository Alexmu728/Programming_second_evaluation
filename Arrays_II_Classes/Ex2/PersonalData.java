package Second_Evaluation.Arrays_II_Classes.Ex2;

public class PersonalData {
    private String name;
    private String name_owner;

    public PersonalData(String name, String name_owner){
        this.name=name;
        this.name_owner=name_owner;
    }
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName_owner(){
        return this.name_owner;
    }
    public void setName_owner(String name_owner){
        this.name_owner=name_owner;
    }
}
