package Second_Evaluation.StringAndMathEx;

public class StringContainer {
    private String string;

    private int changes;

    public StringContainer(String string) {
        this.string = string;
        this.changes = 0;
    }

    public String getString() {
        return this.string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String toString() {
        return this.string + " ";
    }

    public boolean isEqualTo(StringContainer sc) {
        if (this.string.equals(sc.getString())) {
            return true;
        } else {
            return false;
        }
    }

    public void shiftRight(int positions){
        String aux=this.string.substring(0, this.string.length()-positions);
        for(int i=0;i<positions;i++){
            aux="-"+aux;
        }
        this.string=aux;
        System.out.println(aux);
        this.changes++;
    }

    public void shiftLeft(int positions){
        String aux=this.string.substring(positions, this.string.length());
        for(int i=0;i<positions;i++){
            aux+= "-";
        }
        this.string=aux;
        this.changes++;
        System.out.println(aux);
    }

    public void rotate(int positions, char direction){
        if(Character.compare(direction, 'L')==0){
            String aux=this.string.substring(0, positions);
            String aux2=this.string.substring(positions+1, this.string.length());
            System.out.println(aux2+aux);
        }else{
            String aux=this.string.substring(0, this.string.length()-1);
            String aux2=this.string.substring( 2);
        }
    }

    public String encoding(int amount){
        char[] charArray= this.string.toCharArray();
        for(int i=0;i<charArray.length;i++){
            int auxNUm=(int)(this.string.charAt(i));
            int auxOperation;
            if (i % 2 == 0) {

                auxOperation=auxNUm+amount;
            }else{
                auxOperation=auxNUm-amount;
            }
            if(auxOperation>122){
                auxOperation=auxOperation-122+97;
                System.out.println("AuxOperation: "+auxOperation);
            }else if(auxOperation<97){
                auxOperation=auxOperation+(122-97);
            }
            charArray[i]=(char)(auxOperation);
        }
        System.out.println(charArray);
        return new String(charArray);
    }

    public String encoding(){
        int aux=(int)(Math.random()*25)+97;
        return encoding(aux);
    }

    public static StringContainer mixWords(StringContainer s1, StringContainer s2){
        String[] string1=s1.getString().split(" ");
        String[] string2=s2.getString().split(" ");
        String[] result=new String[string1.length+string2.length];

        boolean firstSmaller=true;
        int min=string1.length;
        if(string1.length>string2.length){
            firstSmaller=false;
            min= string2.length;
        }

        for(int i=0;i<min;i++){
            result[i*2]=string1[i];
            result[(i*2)+1]=string2[i];
        }

        int pos=min*2;
        if(!firstSmaller){
            for(int i=min;i<string1.length;i++){
                result[pos]=string1[i];
                pos++;
            }
        }else{
            for(int i=min;i<string2.length;i++){
                result[pos]=string2[i];
                pos++;
            }
        }
        System.out.println("SOL: "+(String.join(" ", result)));
        return new StringContainer(String.join(" ", result));
    }
}