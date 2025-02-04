
import java.util.*;





public class copycon {
 public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    Scanner s=new Scanner(System.in);
    while(s.hasNextInt()){
        int a=s.nextInt();
        list.add(a);
    }
    System.out.println(list);
    Set<Integer> set=new LinkedHashSet<>(list);
    System.out.println(set);
    
 }   
}
