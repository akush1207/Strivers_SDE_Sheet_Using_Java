package DAY5;

public class ReverseALinkedList {
    static class Node{
        Node next;
        int value;
        Node(int value){
            this.value=value;
        }
    }
    public Node add(Node head,int value){
        Node toAdd=new Node(value);
        if (head != null) {
            toAdd.next = head;
        }
        head=toAdd;
        return head;
    }
    public void display(Node head){
        if(head==null){
            System.out.println("Linked List is empty.");
        }else{
            System.out.print("Linked List: ");
            Node curr=head;
            while (curr!=null){
                System.out.print(curr.value);
                if(curr.next!=null){
                    System.out.print("->");
                }
                curr=curr.next;
            }
            System.out.println();
        }
    }
    public Node reverse(Node head){
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
        ReverseALinkedList list=new ReverseALinkedList();
        Node head=new Node(1);
        head=list.add(head,2);
        head=list.add(head,3);
        head=list.add(head,4);
        head=list.add(head,5);
        list.display(head);
        Node newHead=list.reverse(head);
        list.display(newHead);
    }
}
