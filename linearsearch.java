import java.util.*;
public class linearsearch {
    static boolean ls(int arr[],int k){
        boolean a=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                a=true;
                break;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(ls(arr,k));

    }
}
