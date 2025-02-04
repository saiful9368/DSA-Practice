@FunctionalInterface
interface kk{
    void fun();
    //or default void fun1();
    // static void fun1(){

    // }
}

public class lambdacl{
    public static void main(String[] args) {
        kk obj=( )->System.out.println("Hello World");
        obj.fun();
    }
//     public void fun() {
//         System.out.println("Hello World");
// }
}
