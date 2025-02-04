import java.util.*;
public class numfor {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        try{
            String[] part=str.split(":");
            int a=Integer.parseInt(part[0]);
            int b=Integer.parseInt(part[1]);
            if(part.length>2){
                throw new IllegalArgumentException("Invalid input");
            }else if(a<0||b<0){
                throw new IllegalArgumentException("Invalid input");
            }else{
                if(a==0){
                    System.out.println(b +" minutes ");
                }else{
                    System.out.println(a*60+b+" minutes");
                }
            }
        }catch(NumberFormatException e){
            System.out.println("Invalid input");
        }catch(IllegalArgumentException e){
            System.out.println("Invalid input");
        }



        // try{
        //     int a=Integer.parseInt(str);
        //     System.out.println("It is valid "+a);
        // }catch(NumberFormatException e){
        //     System.out.println("Invalid input");
        // }
    }
    
}
 