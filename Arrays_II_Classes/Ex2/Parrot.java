package Second_Evaluation.Arrays_II_Classes.Ex2;

public class Parrot extends Bird {
     private char region;
     private String colour;

     public Parrot(char sex, int age, PersonalData names, char region, String colour){
        super(sex, age, names);
        this.region=region;
        this.colour=colour;
    }

    public char getRegion(){
         return this.region;
    }

    public void setRegion(char region){
         this.region=region;
    }
    public void WhereAreYouFrom(){
        String r= " ";
        switch(this.region){
            case 'N':
                r=("North");
                break;
            case 'S':
                r=("South");
                break;
            case 'E':
                r=("East");
                break;
            case 'W':
                r=("West");
                break;
            default:
                r="Error";
        }
        System.out.println(r);
    }

    @Override
    public void WhoAmI(){
         System.out.println("Parrot[ "+this.getSex()+" "+this.getAge()+" "+this.region+" "+this.colour+" ]");
    }
    @Override
    public void sing() {
        String name= this.getNames().getName();
        System.out.println("My name is "+name+". Pio-pio cute parrot");
    }

}
