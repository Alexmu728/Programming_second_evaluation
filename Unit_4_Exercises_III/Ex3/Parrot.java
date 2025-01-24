package Second_Evaluation.Unit_4_Exercises_III.Ex3;

 class Parrot extends Bird{
     char region;
     String colour;

     Parrot(char sex, int age, char region, String colour){
        super(sex, age);
        this.region=region;
        this.colour=colour;
    }

    void WhereAreYouFrom(){
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

    /*@Override
    void WhoAmI(){
         System.out.println("Parrot[ "+this.sex+" "+this.age+" "+this.region+" "+this.colour+" ]");
    }*/

}
