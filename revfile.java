import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;
import java.util.*;


public class revfile {
    public static void main(String[] args) {
        try{

        
        File f=new File("C:/Users/HP/OneDrive/Documents/saifjava.txt");
        Scanner s=new Scanner(f);
        List<String> wx=new ArrayList<>();
        while (s.hasNext()) {
            String str=s.nextLine();
            String [] w=str.split(" ");
            for (int i = 0; i < w.length; i++) {
                StringBuilder c=new StringBuilder(w[i]);
                wx.add(c.reverse().toString());
                System.out.print(c.reverse()+" ");
                

            }
            System.out.println(w.length);
            
            
        }
        System.out.println(wx);
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
