import java.util.*;


public class linkedlist {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();
        while(s.hasNextInt()){
            int in=s.nextInt();
            list.add(in);
        }
        
        System.out.println(list);
        int a=list.size();
        list.remove(a/2);
        System.out.println(list);
    }
}
