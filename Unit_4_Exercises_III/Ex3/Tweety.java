package Second_Evaluation.Unit_4_Exercises_III.Ex3;

 class Tweety extends Canary{

     int movies;

    public Tweety(char sex, int age, float size,int movies) {
         super(sex, age, size);
         this.movies=movies;
    }

    public static void main(String[] args){
         Tweety t= new Tweety('f', 20, 3.4f, 4);
         Parrot p=new Parrot('m', 8, 'S', "blue");

         t.WhoAmI();
         p.WhoAmI();

         t.display();
         p.WhereAreYouFrom();

         t.size=5.6f;
         t.display();;

         p.region='N';

         System.out.println("Number of birds "+p.NumberOfBirds());
    }
}
