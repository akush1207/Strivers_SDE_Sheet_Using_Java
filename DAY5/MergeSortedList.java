package DAY5;

public class MergeSortedList {

    public static Node mergeList(Node list1,Node list2){
        Node merged=new Node(-1);
        Node curr=merged;
        Node curr1=list1,curr2=list2;
        while (curr1!=null && curr2!=null){
            if(curr1.value <= curr2.value){
                curr.next=curr1;
                curr1=curr1.next;
            }else{
                curr.next=curr2;
                curr2=curr2.next;
            }
            curr=curr.next;
        }
        if(curr1!=null){
            curr.next=curr1;
        }
        if(curr2!=null){
            curr.next=curr2;
        }
        return merged.next;
    }
    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        Node head1=new Node(1);
        list.add(head1,2);
        list.add(head1,4);
        list.display(head1);
        Node head2=new Node(1);
        list.add(head2,3);
        list.add(head2,4);
        list.display(head2);
        list.display(mergeList(head1,head2));
    }
}
