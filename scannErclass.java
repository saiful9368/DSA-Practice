import java.util.Scanner;
public class scannErclass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        float b= sc.nextFloat();
        String c=sc.nextLine();
        String d=sc.next();
        char e=sc.next().charAt(0);
        System.out.println("integer "+a);
        System.out.println("Float "+b);
        System.out.println("Stringg "+c);
        System.out.println("word "+d);
        System.out.println("a character "+e);
    }
    
}
