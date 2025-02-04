public class methodover {
    void funn(float b){
        System.out.println("volume "+((4/3)*3.14*b*b*b));
    }
    void funn(float a,float b){
        System.out.println("area of rec "+a*b);
    }
    void funn(int a){
        System.out.println("volume of cube "+a*a*a);
    } 
    public static void main(String[] args) {
        methodover sk=new methodover();
        sk.funn(3.1f);
        sk.funn(5.2f, 4.34f);
        sk.funn(30);
        
    }
}
