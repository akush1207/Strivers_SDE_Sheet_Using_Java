package DAY5;

public class ReverseALinkedList {

    public static Node reverse(Node head){
        Node curr=head,nextNode=null;
        while (curr!=null){
            Node temp=curr.next;
            curr.next=nextNode;
            nextNode=curr;
            curr=temp;
        }
        return nextNode;
    }

    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        Node head=list.add(null);
        list.display(head);
        Node newHead=reverse(head);
        list.display(newHead);
    }
}
