import java.util.*;


public class tre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set=new HashSet<>();
        while(sc.hasNext()){
            if(sc.hasNextInt()){
                int a=sc.nextInt();
                set.add(a);
            }else{
                break;
            }
        }
        Set<Integer> set2=new HashSet<>();
        while(sc.hasNext()){
            if(sc.hasNextInt()){
                int b=sc.nextInt();
                set.add(b);
            }else{
                break;
            }
        }
        System.out.println(set);
        System.out.println(set2);
    }
}
