public class vararg {

    void funn(int...a){
        System.out.println("----------------------");
        for(int i:a){
            System.out.println(i);
        }
    }
    void oe(int...x){
        for(int i:x){
            String y=(i%2)==0?"even":"odd";
            System.out.println(i+y);
        }
    }
    public static void main(String[] args) {
        vararg ss=new vararg();
        vararg sk=new vararg();
        ss.funn(1);
        ss.funn();
        ss.funn(1,2,3,4,5,56,7,78);
        sk.oe(2,3,4);
    }
}