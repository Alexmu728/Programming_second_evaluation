package Second_Evaluation.Unit_4_Exercises_III.Ex4;

public class Canary extends Bird {
      private float  size;

     public Canary(char sex, int age, PersonalData names){
        super(sex, age, names);
        this.size=0;
    }
     public Canary(char sex, int age, float size, PersonalData names){
        super(sex, age, names);
        this.size=size;
    }

    public float getSize(){

         return this.size;
    }
    public void setSize(float size){

         this.size=size;
    }

     public void display(){
        if(this.size>30) {
            System.out.println("High");
        } else if (this.size>=15) {
            System.out.println("Middle");
        }else{
            System.out.println("Little");
        }
    }

    @Override

    public void sing() {
        String name= this.getNames().getName();
        System.out.println("My name is "+name+". Pio-pio I'm a canary");
    }
}
