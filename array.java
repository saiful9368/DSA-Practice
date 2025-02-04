import java.util.Scanner;
// public class arrays {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         // int []b={1,2,3,4,4,5};
//         // //b={1,2,3,4,4,5};
//         // for(int i=0;i<10;i++){
//         //     System.out.println(b[i]);
//         // }
//         //System.out.println(b);
//         int []c=new int[111];
//         for(int i=0;i<10;i++){
//             c[i]=sc.nextInt();
//         }
//         for(int i:c){
//             System.out.println(c[i]);
//         }
//     }
// }
// public class arrays {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the no of subjects");
//         int a=sc.nextInt();
//         System.out.println("enter the marks of all sub");
//         int []m=new int[a] ;
//         int sum=0;
//         for(int i=0;i<a;i++){
//             m[i]=sc.nextInt();
//             sum+=m[i];
//         }
//         float p=sum/a;
//         System.out.println(p);
//     }
// }

public class array{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int []arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a-1;i++){
            if(arr[i]>=arr[i+1]){
                arr[i+1]=arr[i];
                arr[i]=arr[i+1];
            }
        }
        System.out.println(arr);
    }
}

