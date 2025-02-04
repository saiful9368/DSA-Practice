import java.util.*;



public class queuee {
    // public static void main(String[] args) {
    //     Queue<Integer> q = new LinkedList<>();
    //     q.add(10);
    //     q.offer(20);
    //     q.offer(30);
    //     //System.out.println(q);
    //     //q.remove() ;
    //     System.out.println(q);
    //     System.out.println(q.peek());
    //     System.out.println(q.poll());
        
    //     System.out.println(q.element());
    //     System.out.println(q.contains(20));
    //     System.out.println(q.size());
    //     System.out.println(q.isEmpty());
    // }offer     
     public static void main(String[] args) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            pq.offer(100);
            pq.offer(20);
            pq.offer(300);
            pq.offer(40);
            pq.offer(50);
            System.out.println(pq.peek());
            System.out.println(pq.poll());
            System.out.println(pq);
            System.out.println(pq.remove());
            System.out.println(pq.element());
            System.out.println(pq.size());
            System.out.println(pq.isEmpty());
        }



}
