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

        int count=0;
        int x=n;
        while(x>0)
        {
            x=x/10;
            count++;
        }
        int rev=0;
        System.out.println(count);
        int c=n,m=count-1;
        while(c>0){
            int p=c%10;
            rev=rev*10+p;
            c=c/10;
        }
        System.out.println(rev);


    }
}
