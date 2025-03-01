package DAY5;

public class DeleteNodeInALinkedList {
    public static void deleteNode(Node toDelete){
        toDelete.value=toDelete.next.value;
        toDelete.next=toDelete.next.next;
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
        deleteNode(head.next.next);
        list.display(head);
    }
}
