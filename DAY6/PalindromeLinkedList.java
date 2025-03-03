package DAY6;

import DAY5.Node;
import DAY5.SingleLinkedList;

public class PalindromeLinkedList {
    public static boolean isPalindrome(Node head){
        Node slow=head,fast=head;
        while (slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=reverse(slow);
        while (mid!=null){
            if(mid.value!=head.value){
                return false;
            }
            mid=mid.next;
            head=head.next;
        }
        return true;
    }
    public static Node reverse(Node node){
        Node curr=node,prev=null;
        while (curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        Node head=list.add(null);
        list.display(head);
        System.out.println("Is Palindrome:"+isPalindrome(head));
    }
}
