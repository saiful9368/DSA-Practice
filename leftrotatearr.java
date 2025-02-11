import java.util.*;
public class leftrotatearr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // int temp=arr[0];
        // for(int i=1;i<n;i++){
        //     arr[i-1]=arr[i];
        // }
        // arr[n-1]=temp;
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }
        int d=sc.nextInt();
        int temp[]=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for(int i=0;i<d;i++){
            arr[n-d+i]=temp[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
