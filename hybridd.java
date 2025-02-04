//hybrid inheritence
interface A{
    int rl=23032;
    void fun();
}
interface B{
    String c="Hello";
    void show();
}
class C implements A,B{
    public void fun(){
        System.out.println("C inherit A");
    }
    public void show(){
        System.out.println("C inherits B");
    }
}

class D extends C{
    D(){
        System.out.println("Tis is class D");
    }
}
class E extends D{
    E(){
        System.out.println("This is class E");
    }
}

public class hybridd {
    public static void main(String[] args) {
        E obj1=new E();
        D 
        obj1.fun();
        obj1.show();
        
    }
}
