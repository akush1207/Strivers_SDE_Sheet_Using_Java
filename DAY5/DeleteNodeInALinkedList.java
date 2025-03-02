package DAY5;

public class DeleteNodeInALinkedList {
    public static void deleteNode(Node toDelete){
        toDelete.value=toDelete.next.value;
        toDelete.next=toDelete.next.next;
    }
    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        Node head=list.add(null);
        list.display(head);
        deleteNode(head.next.next);
        list.display(head);
    }
}
