import java.util.*;
public class selectionsort {
    static void print(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minindex=i;

            for(int j=i;j<n;j++){
                if(arr[j]<arr[minindex])
                {
                    minindex=j;
                }

            }
            int temp=arr[i];
            //arr[j]=arr[i];
            
            arr[i]=arr[minindex];
            arr[minindex]=temp;
            
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
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Solution.mergeSort(arr, 0, n - 1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
