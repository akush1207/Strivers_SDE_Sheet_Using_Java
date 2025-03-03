package DAY6;

import DAY5.SingleLinkedList;
import DAY5.Node;

import java.util.ArrayList;
import java.util.List;

public class FlattenTheLinkedList {
    public static Node flatten(Node head){
        List<Integer> arr=new ArrayList<>();
        while (head!=null){
            arr.add(head.value);
            Node bottom=head.bottom;
            while (bottom!=null){
                arr.add(bottom.value);
                bottom=bottom.next;
            }
            head=head.next;
        }
        arr.sort(null);
        System.out.println("arr:"+arr);
        return convertArrayToLinkedList(arr);
    }
    public static Node convertArrayToLinkedList(List<Integer> arr){
        Node head = null;
        for(int i=arr.size()-1;i>=0;i--){
            Node toAdd=new Node(arr.get(i));
            if (head != null) {
                toAdd.next = head;
            }
            head=toAdd;
        }
        return head;
    }
    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        Node head=list.add(null);
        list.display(head);
        Node bottom1=list.add(null);
        head.bottom=bottom1;
        list.display(bottom1);
        Node bottom2 =list.add(null);
        head.next.bottom=bottom2;
        list.display(bottom2);
        Node bottom3=list.add(null);
        head.next.next.bottom=bottom3;
        list.display(bottom3);
        Node bottom4=list.add(null);
        head.next.next.next.bottom=bottom4;
        list.display(bottom4);
        list.display(flatten(head));

    }
}
