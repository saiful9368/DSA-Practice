import java.util.*;

public class linkl {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void printt(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;

        if(head.next==null){
            head=null;
            return;
        }
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    public static void main(String[] args) {
        linkl ll=new linkl();
        ll.addFirst("1");
        ll.addFirst("2");
        ll.addFirst("3");
        ll.addFirst("4");
        ll.addLast("10");
        ll.addLast("11");
        ll.addLast("12");
        ll.addLast("13");
        ll.printt();
        ll.deleteFirst();
        ll.printt();
        ll.deleteLast();
        ll.printt();
    }
    
}
