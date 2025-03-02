package DAY6;

import DAY5.Node;
import DAY5.SingleLinkedList;

public class LinkedListCycleII {
    public static Node startOfCycle(Node head){
        Node slow=head,fast=head;
        while (slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(fast==null || fast.next==null){
            return null;
        }
        while (head!=null && fast!=head){
            head=head.next;
            fast=fast.next;
        }
        return head;
    }

    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        Node head=new Node(3);
        list.add(head,2);
        list.add(head,0);
        list.add(head,1);
        head.next.next.next=head.next;
        Node start=startOfCycle(head);
        System.out.println( start==null ? "No cycle exist." : "Start of cycle:" + start.value);
    }
}
