package Second_Evaluation.Streams_And_Files_Ex3;

import java.io.Serializable;

public class MobilePhone implements Serializable {
    private int number;
    private float credit;

    private static final long serialVersionUID=1L;

    public MobilePhone(int number, float credit){
        this.number=number;
        this.credit=credit;
    }

    public void display(){
        System.out.println("number: "+this.number+", credit: "+this.credit);
    }

    public void topup(float s){
        this.credit+=s;
    }

    public void call(int minutes){
        this.credit-=minutes*2;
    }


}
