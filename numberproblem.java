import java.util.*;

public class numberproblem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        // int count=0;
        // int x=n;
        // while(x>0)
        // {
        //     x=x/10;
        //     count++;
        // }
        // System.out.println(count);

       
        // int rev=0;
        
        // int c=n;
        // while(c>0){
        //     int p=c%10;
        //     rev=rev*10+p;
        //     c=c/10;
        // }
        // System.out.println(rev);

        int rev=0;
        
        int c=n;
        while(c>0){
            int p=c%10;
            rev=rev*10+p;
            c=c/10;
        }
        System.out.println(rev);

        if(rev==n){
            System.out.print("The number is pallindrome");
        }else{
            System.out.println("The number is not pallindrome");
        }

    }
}
