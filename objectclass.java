class e{
    int a=10;
    int b=20;
    void fun(){}
        public String toString(){
            return "saif";
        }
    
}



public class objectclass {
    public static void main(String[] args) {
        e ob=new e();
        e ob1=new e();
        System.out.println(ob);
        System.out.println(ob1.toString());
        System.out.println(ob.equals(ob1));
    }
}
