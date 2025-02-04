import java.util.*;
public class reversearr {
    static void print(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
     
    static void rev(int arr[],int n){
        int ans[]= new int[n];
        for(int i=n-1;i>=0;i--){
            ans[n-1-i]=arr[i];
        }
        print(ans,n);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rev(arr,n);
    }
}

// import java.util.*;

// public class arraysort {
//     static void print(int arr[],int n){
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
    
//     static void sort(int arr[],int n){
//         for(int j=0;j<n-1;j++){
//         for(int i=0;i<n-1-j;i++){
//             if(arr[i]>arr[i+1]){
//                 int temp=arr[i];
                
//                 arr[i]=arr[i+1];
//                 arr[i+1]=temp;
//             }
//         }}
       
      
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         sort(arr,n);
//         print(arr, n);
//     }

// }
