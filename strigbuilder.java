public class strigbuilder {

    public static void main(String[] args) {
        StringBuilder sc=new StringBuilder("Hello");
        String b=" Mukesh sama";
        sc.ensureCapacity(22);
        System.out.println(sc.length());
        System.out.println(sc.capacity());
        sc.append(b);
        System.out.println(sc);
        //System.out.println(sc.reverse());
        sc.delete(6, 13);
        sc.insert(6,"MUKESH");
        System.out.println(sc);
        String c=sc.substring(6);
        System.out.println(c);
        
    }
}