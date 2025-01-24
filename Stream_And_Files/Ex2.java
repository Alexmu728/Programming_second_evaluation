package Second_Evaluation.Stream_And_Files;

import java.io.*;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Input the address of the input file:");
        String inputFile=sc.nextLine();

        System.out.println("Input the address of the output file:");
        String outputFile=sc.nextLine();

        System.out.println("Input the address of the second output file:");
        String outputFile2=sc.nextLine();

        BufferedReader br= null;
        BufferedWriter bw=null;

        BufferedWriter bw2=null;

        try{
            br=new BufferedReader(new FileReader(inputFile));
            bw=new BufferedWriter(new FileWriter(outputFile));

            int character= br.read();
            while (character!=-1){
                bw.write(character);
                character=br.read();
            }

            if(br!=null){
                br.close();
            }
            if(bw!=null){
                bw.close();
            }

            br=new BufferedReader(new FileReader(inputFile));

            bw2=new BufferedWriter(new FileWriter(outputFile));

            char[] buffer=new char[20];
            int bytesRead=br.read(buffer);
            while(bytesRead!=-1){
                bw2.write(buffer, 0, bytesRead);
                bytesRead=br.read(buffer);
            }


            if(bw2!=null){
                bw2.close();
            }
        }catch (IOException e){
            System.out.println("The file doesn't exist");
        }
    }
}
