package Second_Evaluation.Exception.Ex5;

public class Movie {
    private String name;
    private int duration;
    private int year;

    public Movie(String name, int duration, int year) throws WrondDatadException{
            if(name.equals(" ")){
                throw new WrondDatadException("Title cannot be empty");
            }else if(year<2023){
                throw new WrondDatadException("Wrong number introduced");
            }
            this.name=name;
            this.duration=duration;
            this.year=year;


    }

    public String getName(){
        return this.name;
    }
    public int getDuration(){
        return this.duration;
    }
    public int getYear(){
        return this.year;
    }

    @Override
    public String toString(){
        return "Movie: "+this.name+" Duration: "+this.duration+" Year: "+this.year;
    }

    public boolean isEqual(Object o){
        if(this==o) return true;
        if(o==null || getClass() != o.getClass()) return false;
        Movie movie= (Movie) o;
        if(this.duration< movie.duration+5 && this.duration> movie.duration-5 &&
            this.year== movie.year && this.name.toLowerCase().equals(movie.name.toLowerCase())){
            return true;
        }
        return false;
    }

}
