package DAY5;

public class FindMiddleOfTheLinkedList {

    public static Node middleNode(Node head){
        Node slow=head,fast=head;
        while (slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        Node head=list.add(null);
        list.display(head);
        System.out.println("Middle Node :"+middleNode(head).value);
    }
}
