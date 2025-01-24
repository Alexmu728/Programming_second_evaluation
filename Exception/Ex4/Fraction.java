package Second_Evaluation.Exception.Ex4;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator= numerator;
        this.denominator=denominator;
    }

    @Override
    public String toString(){
        return "numerator: "+this.numerator+" denominator: "+this.denominator;
    }
}
