import java.util.*;

public class checksortarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean x=true;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                x=false;
                break;
            }
            
        }
        if(x){
            System.out.println("The array is sorted");
        }else{
            System.out.println("The array is not sorted");
        }
    }
}
