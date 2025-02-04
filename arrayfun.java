import java.util.*;

// public class arrayfun {
//     void fun(int []aa){
//         for (int k:aa){
//             System.out.println(k);
//         }
//     }
//     public static void main(String[] args) {
//         int a[]={1,2,3,4,5};
//         System.out.println(a);
//         int b[];
//         b=a.clone();
//         System.out.println(b);
//         b[2]=1000;
//         for(int i:b){
//             System.out.println(i);
//         }
//         for(int j:b){
//             System.out.println(j);
//         }
//         arrayfun mk=new arrayfun();
//         mk.fun(b);
//     }
    
// }


public class arrayfun{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<>();
        while(s.hasNextInt()){
            int i=s.nextInt();
            a.add(i);
            
        }
        // for(int x:a){
        //     System.out.println(x);
        // }
        a.set(3,1999);
        Collections.sort(a);
        for(int x:a){
            System.out.println(x);
        }
    }
}