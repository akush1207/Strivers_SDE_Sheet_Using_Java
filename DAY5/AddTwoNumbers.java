package DAY5;

public class AddTwoNumbers {
    public static Node addTwoNumbers(Node l1, Node l2) {
        Node ans=new Node(-1);
        Node curr=ans;
        int carry=0;
        while(l1!=null||l2!=null||carry==1) {
            int sum=0;
            if(l1!=null) {
                sum+=l1.value;
                l1=l1.next;
            }
            if(l2!=null) {
                sum+=l2.value;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            Node toAdd=new Node(sum%10);
            curr.next=toAdd;
            curr=toAdd;
        }
        return ans.next;
    }
    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        Node head1=list.add(null);
        Node head2=list.add(null);
        list.display(head1);
        list.display(head2);
        list.display(addTwoNumbers(head1,head2));
    }
}
