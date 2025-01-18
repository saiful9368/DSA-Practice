import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=n,sum=0;
        while(x>0){
            int a=x%10;
            sum=sum+a*a*a;
            x=x/10;
        }
        if(sum==n){
            System.out.println("The number is armstrong number");
        }else{
            System.out.println("The number is not armstrong number");
        }
    }
}
