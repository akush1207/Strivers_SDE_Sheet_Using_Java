package DAY5;

public class RemoveNthNodeFromEndOfList {

    public static int size(Node head){
        Node curr=head;
        int len=0;
        while (curr!=null){
            len++;
            curr=curr.next;
        }
        return len;
    }
    public static Node removeNthNodeFromEnd(Node head,int n){
        int len=size(head);
        int ind=len-n;
        if(ind==0){
            head=head.next;
        }else if(ind==len-1){
            Node curr=head;
            while (curr.next.next!=null){
                curr=curr.next;
            }
            curr.next=null;
        }else{
            Node curr=head;
            for(int i=0;i<ind-1;i++){
                curr=curr.next;
            }
            curr.next=curr.next.next;
        }
        return head;
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
        list.display(removeNthNodeFromEnd(head,2));
    }
}
