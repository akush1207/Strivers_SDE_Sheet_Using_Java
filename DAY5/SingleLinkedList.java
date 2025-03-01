package DAY5;

public class SingleLinkedList {

    public boolean isEmpty(Node head){
        return head==null;
    }

    public void add(Node head,int value){
        Node toAdd=new Node(value);
        if(isEmpty(head)){
            head=toAdd;
            head.next=null;
        }else{
            Node curr=head;
            while (curr.next!=null){
                curr=curr.next;
            }
            curr.next=toAdd;
            toAdd.next=null;
        }
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
}
