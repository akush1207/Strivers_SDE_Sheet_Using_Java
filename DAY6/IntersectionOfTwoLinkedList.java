package DAY6;

import DAY5.Node;
import DAY5.SingleLinkedList;

public class IntersectionOfTwoLinkedList {

    public static Node intersection(Node headA,Node headB){
        Node curr1=headA,curr2=headB;
        while (curr2!=curr1){
            if(curr1==null){
                curr1=headB;
            }else{
                curr1=curr1.next;
            }
            if(curr2==null){
                curr2=headA;
            }else{
                curr2=curr2.next;
            }
        }
        return curr1;
    }
    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        Node headA=list.add(null);
        Node headB=list.add(null);
        Node mergePoint=list.add(null);
        headA.next.next=mergePoint;
        headB.next.next.next=mergePoint;
        list.display(headA);
        list.display(headB);
        System.out.println("Intersection Point Is :"+intersection(headA,headB).value);
    }
}
