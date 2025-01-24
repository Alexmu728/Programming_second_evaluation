package Second_Evaluation.Stream_And_Files;

import java.io.*;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= null;
        BufferedWriter bwfile= null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input the number of elements you want to inpur: ");
            int numElements = Integer.parseInt(br.readLine());

            bwfile= new BufferedWriter(new FileWriter("nums.bin"));
            for(int i=0; i<numElements;i++){
                int num=Integer.parseInt(br.readLine());
                bwfile.write(num);
            }
        } catch (NumberFormatException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(bwfile!=null){
                bwfile.close();
            }
        }
        BufferedReader brFile2=null;
        BufferedWriter bwFile2= null;

        try{
            brFile2= new BufferedReader(new FileReader("nums.bin"));
            bwFile2= new BufferedWriter(new FileWriter("nums.txt"));

            int num2= brFile2.read();
            while(num2!=-1){
                bwFile2.write(String.valueOf(num2));
                bwFile2.newLine();
                num2=brFile2.read();
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            if(brFile2!=null){
                brFile2.close();
            }
            if(bwFile2!=null){
                bwFile2.close();
            }
        }
    }
}
