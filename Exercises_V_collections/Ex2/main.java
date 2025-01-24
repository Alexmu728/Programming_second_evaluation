package Second_Evaluation.Exercises_V_collections.Ex2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class main {
        private List<Points> points;

        public main(){
            Scanner sc=new Scanner(System.in);
            System.out.println("How many point do you want?");
            int num=sc.nextInt();

            this.points=new ArrayList<>();
            double x, y;

            for(int i=0;i<num;i++){
                System.out.println("Input x: ");
                x=sc.nextDouble();
                System.out.println("Input y: ");
                y=sc.nextDouble();
                this.points.add(new Points(x, y));
            }
        }

        public main(List<Points> points){
            this.points=points;
        }

        public void display(){
            for(Points p:this.points){
                System.out.println(p.toString());
            }
        }

        public static void display(List<Points> list){

        }

        public List<Points> reverse(){
            List<Points> res=new ArrayList<>();
            for(int i=this.points.size()-1;i>0;i--){
                res.add(this.points.get(i));
            }
            return res;
        }

        public Points secondCuadrant(){
            Iterator<Points> it= this.points.listIterator();
            boolean found=false;
            Points res=null;
            while(it.hasNext() && !found){
                Points p=(Points)it.next();
                if(p.getX()<0 && p.getY()>0){
                    res= p;
                    found=true;
                }
            }
            return res;
        }

        public void first00Point(){
            boolean finish=false;
            for(int i=0;i<this.points.size() && !finish; i++){
                if(this.points.get(i).getX()==0 && this.points.get(i).getY()==0){
                    System.out.println(i);
                    finish=true;
                }
            }
            if(!finish){
                System.out.println("The ArrayList does not contain any (0,0) point");
            }
        }

        public boolean equals(Object o){
            if(this==o) return true;
            if(o==null) return false;
            Points points=(Points) o;
            return true;
            //return Double.compare(this.x, points.x)==0 && Double.compare(this.y, points.y)==0;
        }

        public void deleteLessThan10Distance(){
            boolean delete=true;
            for(int i=0;i<this.points.size() && delete; i++) {
                double x = this.points.get(i).getX();
                double y = this.points.get(i).getY();

                if (Math.sqrt(Math.pow(x, 2.0)+Math.pow(y, 2.0))>10){
                    this.points.remove(i);
                    delete=false;
                }
            }
        }

        public void delete4thQuadrant(){
            Iterator<Points> it= this.points.iterator();
            while(it.hasNext()){
                Points p=(Points)it.next();

                if(p.getX()>0 && p.getY()<0){
                    it.remove();
                }
            }
        }

    public static void main(String[] args) {
        List<Points> points=new ArrayList<>();

        points.add(new Points(4.5, 1.3));
        points.add(new Points(5.5, 3.4));
        points.add(new Points(6, 0.2));
        points.add(new Points(2.1, 7));
        points.add(new Points(1, 5));
        points.add(new Points(9, 8.8));
        points.add(new Points(7, 4));
        points.add(new Points(6.5, 3.7));
        points.add(new Points(4.5, 2.5));
        points.add(new Points(0.0, 0.0));




    }
}
