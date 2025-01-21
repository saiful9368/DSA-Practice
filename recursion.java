import java.util.*;
public class recursion {
    // static int x=10;
    // static void print(){
    //     if(x==20){
    //         return;
    //     }
    //     System.out.print(x+" ");
    //     x=x+1;
    //     print();
    // }
    public static int factorial (int n){
        if(n==0){
            return 1;
        }else{
        
        return n*factorial(n-1);}
    }
    public static void main(String[] args) {
        
        System.out.println(factorial(6));
    }

}
