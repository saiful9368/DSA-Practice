import java.util.Scanner;

// @FunctionalInterface
// interface CheckPalindrome {
//     boolean check(int num);
// }

public class palindromlambda {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int  n=s.nextInt();
        String str=Integer.toString(n);
        StringBuilder ss=new StringBuilder(str);
        String rv=ss.reverse().toString();
        System.out.println(rv);
        if(ss.equals(rv)){
            System.out.println(n+" is a pallindrome");
        }else{
            System.out.println(n+" is not a pallindrome");
        }
        // CheckPalindrome checkPalindrome = (num) -> {
        //     int reversedNum = 0;
        //     int originalNum = num;
        //     while (num != 0) {
        //         int lastDigit = num % 10;
        //         reversedNum = reversedNum * 10 + lastDigit;
        //         num = num / 10;
        //     }
        //     return originalNum == reversedNum;
        // };
        // Scanner s=new Scanner(System.in);
        // int  n=s.nextInt();
        
        // System.out.println(checkPalindrome.check(n)); 
        // s.close ();
    }
    
}








