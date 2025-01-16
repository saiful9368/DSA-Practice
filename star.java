import java.util.*;


public class star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<= i;j++){
        //         System.out.print("* ");
        //     }
        //     System.err.println();
        // }
        // int a=n;
        // for (int i = 1; i <= n; i++) {
        //     // Print spaces
        //     for (int j = i; j < n; j++) {
        //         System.out.print("  ");
        //     }
            
        //     // Print stars
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
            
        //     // Move to the next line
        //     System.out.println();
        // }
        // for(int i=0;i<n;i++){
        //     for( int j=i;j<n-1;j++){
        //         System.out.print(" ");
        //     }
        //     for( int w=0;w<((2*i)+1);w++){
        //         System.out.print("*");
        //     }


        //     System.out.println();
        // }
        // for(int i=n;i>0;i--){
        //     for( int j=i;j<n;j++){
        //         System.out.print(" ");
        //     }
        //     for( int w=0;w<((2*i)-1);w++){
        //         System.out.print("*");
        //     }

            
        //     System.out.println();
        // }
        // for(int i=0;i<n;i++){
        //     if(i==0 | i==n-1 ){
        //         for(int j=0;j<n;j++){
        //             System.out.print("* ");
        //     } 
        //     System.out.println();
        //     }else{
        //     for(int k=0;k<n;k++){
        //         if(k==0 | k==n-1 ){ 
        //             System.out.print("* ");
        //     }else{
        //         System.out.print("  ");
        //     }
        // }
        // System.out.println();
        // }}
        //int a=2*n;
        for(int i=0;i<2*n;i++){
            if(i==0 | i==2*n-1){
                for(int j=0;j<n*2;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }else if(i<n){
                for(int l=0;l<n-i;l++){
                    System.out.print("* ");
                }
                for(int m=0;m<i;m++){
                    System.out.print("  ");
                }
                for(int m=0;m<i;m++){
                    System.out.print("  ");
                }
                for(int k=n-i;k>0;k--){
                    System.out.print("* ");
                }
                System.out.println();
                
            }else{
                for(int k=0;k<i-n+1;k++){
                System.out.print("* ");
            }
            // for(int l=2*n-2;l>=2;l=l-2){
            //     System.out.print("  ");
            // }
            for(int k=n*2-i;k>0;k--){
                System.out.print("  ");
            }
            for(int k=0;k<n*2-i-2;k++){
                System.out.print("  ");
            }
            for(int k=i-n+1;k>0;k--){
                System.out.print("* ");
            }

            System.out.println();
        }
        }
    }
}
