 import java.util.*;

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

public class arraysort{
    static void print(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr);
        print(arr);
    }
}