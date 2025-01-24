package Second_Evaluation.Exercises_V_collections.Ex3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Cinema {
    private String c_name;
    private ArrayList<Movie> movies;
    private Movie[] occupiedRooms;

    public Cinema(String c_name, int numRooms){
        this.c_name=c_name;
        this.occupiedRooms=new Movie[numRooms];
        this.movies=new ArrayList<>();
    }

    public int roomOfMovies(String name, int duration, int year){
        Movie m= new Movie(name, duration, year);
        for(int i=0; i<this.occupiedRooms.length;i++){
            if(this.occupiedRooms[i] != null && this.occupiedRooms[i].equals(m)){
                return i;
            }
        }
        return -1;
    }

    public void addMovie(Movie m){
        if(this.movies.contains(m)){
            System.out.println("The movie is already added to the cinema");
        }else{
            int i=0;
            boolean free=false;
            while(i< occupiedRooms.length && !free){
                if(occupiedRooms[i]==null){
                    free=true;
                    occupiedRooms[i]=m;
                    this.movies.add(m);
                }else{
                    i++;
                }
            }
            if(!free){
                System.out.println("There are no free rooms");
            }
        }
    }

    public void addMovie(Movie m, int index){
        if(this.movies.contains(m)){
            System.out.println("The movie is already added to the cinema");
        }else{
            if(index>0 && index<this.occupiedRooms.length && occupiedRooms[index]==null){
                occupiedRooms[index]=m;
                this.movies.add(m);
            }else{
                System.out.println("The room is occupied");
            }
        }
    }

    public void display(){
        System.out.println("Cinema: "+this.c_name);
        int i=0;
        while(i<this.occupiedRooms.length){
            if(this.occupiedRooms[i] != null){
                System.out.println(this.occupiedRooms[i].getName()+ "- Room");
            }
            i++;
        }
    }

    public void removeMovie(String name){
        Iterator<Movie> it=this.movies.iterator();
        while(it.hasNext()){
            Movie m=it.next();
            if(m.getName().toLowerCase().indexOf(name)==0){
                int room=roomOfMovies(m.getName(), m.getDuration(), m.getYear());
                this.occupiedRooms[room]=null;
                it.remove();
            }
        }
    }

    /*public List<Integer> freeRooms(){
      return List;
    }
    */

    public void changeRoom(Movie m) {
        int room = this.roomOfMovies(m.getName(), m.getDuration(), m.getYear());
        System.out.println("The movie is in the room " + (room + 1));
        System.out.println("To which room you want to move it?");
        Scanner sc = new Scanner(System.in);
        int newRoom = sc.nextInt();
        newRoom--;
       // List<Integer> free = this.freeRooms();
        /*while (!free.contains(newRoom)) {
            System.out.println("The movie room does not exist or it is occupied");
            System.out.println("To which room you want to move it?");
            newRoom = sc.nextInt();
            newRoom--;
        }*/
        this.occupiedRooms[newRoom] = m;
        this.occupiedRooms[room] = null;
    }


    public void resetCinema(){
        for(int i=0; i<this.occupiedRooms.length;i++){
            this.occupiedRooms[i]=null;
        }
        this.movies.clear();
    }

   /* public List<Movie> moviesShorterThan(int minutes){
        List<Movie> l=new ArrayList<>();

        for(int i=0;i<this.movies.get(i).)
    }*/


}

