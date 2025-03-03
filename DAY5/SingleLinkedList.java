package DAY5;

import java.util.Scanner;

public class SingleLinkedList {

    public boolean isEmpty(Node head){
        return head==null;
    }

    public Node add(Node head){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of nodes to be added:");
        int n=sc.nextInt();
        System.out.print("Enter all the node's value:");
        for(int i=1;i<=n;i++){
            int value=sc.nextInt();
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
}
