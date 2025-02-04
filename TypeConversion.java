import java.util.Scanner;
public class TypeConversion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cups of the day");
        int per_day=sc.nextInt();
        System.out.println("Enter the rate: ");
        double rate=sc.nextDouble();
        System.out.println("ENter the days: ");
        int day=sc.nextInt();
        System.out.println(per_day*rate*day);
    }
}
