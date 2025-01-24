package Second_Evaluation.Classes.Classes_III;

public class NumberStatistic {
    private int total;
    private int numElems;
    public NumberStatistic(){
        this.numElems=0;
        this.total=0;
    }
    public void addNumbers(int num){
        this.total=this.total+num;
        this.numElems=this.numElems+1;
    }
    public int amountofnumbers(){
        return total;
    }
    public void showstatistics(){
        if(numElems>0) {
            double avg = ((double) total / numElems);
            System.out.println("Avg: " + avg);
        }else{

        }
    }
}
