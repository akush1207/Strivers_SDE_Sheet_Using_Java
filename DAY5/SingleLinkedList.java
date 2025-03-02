package DAY5;

import java.util.Scanner;

public class SingleLinkedList {

    public boolean isEmpty(Node head){
        return head==null;
    }

    public Node add(Node head){
        Scanner sc=new Scanner(System.in);
        System.out.print("Do you want to add node (Y/N):");
        char choice=sc.next().charAt(0);
        while (choice=='Y'){
            System.out.print("Enter Node Value:");
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
            System.out.print("Do you want to add more node (Y/N):");
            choice=sc.next().charAt(0);
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
