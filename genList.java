

import java.util.ArrayList;


import java.util.*;

// public class genList {
//     public static void main(String[] args) {


        // List<String> list1=new ArrayList<String>();
        // list1.add("Hello");
        
        // String A=list1.get(0);

        // System.out.println("Original List: "+list1);

        // List<Integer> list2=new ArrayList<Integer>();
        // list2.add(10);
        // int B=list2.get(0);

        // System.out.println("Original List: "+list2);





//     }
// }

// class A<T>{
//     T a;
//     void fun(T b){
//         a=b;
//         System.out.println(a);
//     }
// }
// public class genList {
//     public static void main(String[] args) {
//         A<Integer> obj=new A<Integer>();
//         obj.fun(10);

//         A<String> obj1=new A<String>();

//         obj1.fun("Hello");
//     }
// }
// class A<T,U>{
//     T a;
//     U d;
//     void fun(T b,U c){
//         int a1=(Integer)b*(Integer)b;
//         d=c;
//         System.out.println(a1+" "+c);
//     }
// }
// public class genList {
//     public static void main(String[] args) {
//         A<Integer,String> obj=new A<Integer,String>();
//         obj.fun(10,"NMMNM");

//         A<Integer,String> obj1=new A<Integer,String>();

//         obj1.fun(2,"Hello");
//     }
// }

// class A<T>{
//     T[] n;
//     A(T[] z){
//         n=z;
//     }
//     double av(){
//         double sm=0.0;
//         for(int i=0;i<n.length;i++){
//             sm+=(Integer)n[i];
//             }
//         return sm/n.length;

//     }
// }

// class A<T,W,X,Y>{
    
//     T c;
//     W f;
//     X d;
//     Y e;
//     void fuun(T a,W s,X v,Y n){
//         c=a;
//         f=s;
//         d=v;
//         e=n;
//         System.out.println(c+" "+f+" "+d+" "+" "+e);
//     }
//     // void fun(T b){
//     //     a=b;
//     //     System.out.println(a);
//     // }
// }
// public class genList {
//     public static void main(String[] args) {
//         A<Integer,String,Integer,String> obj=new A<>();
//         obj.fuun(10,"Sa",20,"cvbb");

//         // A<String> obj1=new A<String>();

//         // obj1.fun("Hello");
//     }
// }

// interface A<T>{
//     T fun(T a);
// }
// public class genList implements A<Integer>{
//     public Integer fun(Integer a){
//         System.out.println(a);
//         return a;
//     }
//     public static void main(String[] args) {
//         genList obj=new genList();
//         obj.fun(10);
//     }
// }

// interface A<T>{
//     T fun(T a);
// }
// public class genList<T> implements A<T>{
//     public T fun(T a){
//         System.out.println(a);
//         return a;
//     }
//     public static void main(String[] args) {
//         genList<Integer> obj=new genList<>();
//         obj.fun(10);
//         genList<String> obj1=new genList<>();
//         obj1.fun("Hello");
//     }
// }

// interface A<T>{
//     T fun(T a);
// }
// public class genList implements A{
//     public Object fun(Object a){
//         System.out.println(a);
//         return a;
//     }
//     public static void main(String[] args) {
//         genList obj=new genList();
//         obj.fun(10);
//         obj.fun("Hello");
//     }
// }

// class A<T extends Number>{
//     T a;
//     void fun(T a){
//         System.out.println(a.doubleValue()+a.doubleValue());
//     }
    
// }
// public class genList{
//     public static void main(String[] args) {
//         A<Integer> obj=new A<>();
//         obj.fun(10);
//         A<Double> obj1=new A<>();
//         obj1.fun(10.5);
//         A<Float> obj2=new A<>();
//         obj2.fun(10.5f);
//     }
// }

public class genList{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();

        while(s.hasNextInt()){
            int a=s.nextInt();
            list.add(a);
        }
        System.out.println(list);
    }

}