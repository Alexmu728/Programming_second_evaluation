package Second_Evaluation.Stream_And_Files;

import java.io.*;

public class Ex3 {

    public static String reverseStringv1(String line){
        char[] cArray = line.toCharArray();
        int left=0;
        int right=cArray.length-1;

        while(left<right){//swapping elements of the sides
            char temp = cArray[left];
            cArray[left]=cArray[right];
            cArray[right]=temp;

            left++;
            right--;
        }

        return(new String(cArray));
    }


    public static String reverseStringv2(String line){
        StringBuilder sb= new StringBuilder(line);
        sb.reverse();
        return cutString(sb.toString());
    }

    public static String cutString(String line){
        if(line.length()>30){
            return line.substring(0, 30).trim();
        }
        return line.trim();
    }

    public static void main(String[] args) {
        BufferedReader br=null;
        BufferedWriter bw=null;

        try{
            br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input the name of the file");
            String file=br.readLine();
            bw=new BufferedWriter(new FileWriter(file));
            System.out.println("Input your text");
            String line=br.readLine();

            while(!line.isEmpty()){
                bw.write(reverseStringv2(line));
                bw.newLine();

                System.out.println("Input your text");
                line=br.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(bw!=null){
                    bw.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }try{
                if(br!=null){
                    br.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
