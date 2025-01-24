package Second_Evaluation.Unit_4_Exercises_III.Ex3;

 class Canary extends Bird{
      float  size;

     Canary(char sex, int age){
        super(sex, age);
        this.size=0;
    }
     Canary(char sex, int age,float size){
        super(sex, age );
        this.size=size;
    }

     void display(){
        if(this.size>30) {
            System.out.println("High");
        } else if (this.size>=15) {
            System.out.println("Middle");
        }else{
            System.out.println("Little");
        }
    }

}
