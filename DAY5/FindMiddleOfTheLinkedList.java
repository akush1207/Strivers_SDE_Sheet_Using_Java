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
        Node head=new Node(1);
        list.add(head,2);
        list.add(head,3);
        list.add(head,4);
        list.add(head,5);
        list.add(head,6);
        list.display(head);
        System.out.println("Middle Node :"+middleNode(head).value);
    }
}
