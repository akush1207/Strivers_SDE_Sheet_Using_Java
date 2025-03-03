package DAY6;

import DAY5.Node;
import DAY5.SingleLinkedList;

public class ReverseNodesInKGroup {
    public static Node reverseGroup(Node head,int k){
        Node curr=head,prevLast=null;
        while (curr!=null){
            Node kthNode=getKthNode(curr,k);
            if(kthNode==null){
                if(prevLast!=null){
                    prevLast.next=curr;
                }
                break;
            }
            Node nextNode=kthNode.next;
            kthNode.next=null;
            reverse(curr);
            if(curr==head){
                head=kthNode;
            }else{
                prevLast.next=kthNode;
            }
            prevLast=curr;
            curr=nextNode;
        }
        return head;
    }
    public static Node getKthNode(Node node,int k){
        k--;
        while (node!=null && k>0){
            node=node.next;
            k--;
        }
        return node;
    }
    public static void reverse(Node node){
        Node curr=node,prev=null;
        while (curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
    }
    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        Node head=list.add(null);
        list.display(head);
        Node newHead=reverseGroup(head,2);
        list.display(newHead);
    }
}
