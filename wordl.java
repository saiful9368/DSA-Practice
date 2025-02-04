import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class wordl {
    public static void main(String[] args) {
        try{
            int a=0;
            String str="";
            File in=new File("C:/Users/HP/OneDrive/Documents/saifjava.txt");
            Scanner sc=new Scanner(in);
            while(sc.hasNext()){
                String word=sc.next();
                if(word.length()>a){
                    a=word.length();
                    str=word;
                }
            }
            System.out.println("The longest word is "+str);
        }catch(IOException e){
            System.out.println("File not found");
        }

























    //     try{
    //         int a=0;
    //         String a1="";
    //         File in=new File("C:/Users/HP/OneDrive/Documents/saifjava.txt");
    //         Scanner sc= new Scanner(in);
    //         while(sc.hasNext( )){
    //              String data=sc.next();
    //              if(data.length()>a){
    //                 a1=data;
    //                 a=data.length();
    //              }   
    //     }
    //     System.out.println(a1+" is the longest word.");
    // }catch(IOException e){
    //     System.out.println( "Error reading the file" );
    // }
}}
