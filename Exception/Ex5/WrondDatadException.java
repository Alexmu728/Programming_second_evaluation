package Second_Evaluation.Exception.Ex5;

public class WrondDatadException extends Exception{

    private String message;
    public WrondDatadException(String message){
        this.message=message;
    }
}
