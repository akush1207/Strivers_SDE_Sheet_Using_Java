package DAY6;

import DAY5.Node;
import DAY5.SingleLinkedList;

public class DetectLinkedListCycle {
    public static boolean detectCycle(Node head){
        Node slow=head,fast=head;
        while (slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        Node head=new Node(3);
        list.add(head,2);
        list.add(head,0);
        list.add(head,1);
        head.next.next.next=head.next;
        System.out.println("Detect Linked List Cycle:"+detectCycle(head));
    }
}
