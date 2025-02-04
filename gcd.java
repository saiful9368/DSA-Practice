import java.util.*;
public class gcd {
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=a>b?a:b;
    int x=1;
    
    for(int i=1;i<=c;i++){
        if (i%a==0 & i%b==0){
            x=i;
        }
    }
    System.out.println(x);
 }   
}
