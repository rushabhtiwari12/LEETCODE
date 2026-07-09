package Linked_List.MEDIUM;

import java.util.Scanner;

// I'll try to solve these question using two approach 
// one is first slow solution and second one is counting approach
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

public class LC2095_delete_middle_node {
    
    // Slow & First Approach
    public static Node deleteMiddleNode(Node head){
        Node prev = null;
        Node s = head;
        Node f = head;

        if(head == null || head.next == null){
            return null;
        }
        while(f!=null && f.next !=  null){
            prev=s;
            s=s.next;
            f=f.next.next;
        }
        prev.next = s.next;

        return head;

    }
    public static void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("Null");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of nodes");
        int n  = sc.nextInt();
        System.out.println("Enter the values of Nodes");

        Node head = null;
        Node tail = null;

        for(int i =0; i<n;i++){
            int value = sc.nextInt();
            Node newNode = new Node(value);

            if(head == null){
                head = newNode;
                tail=newNode;
            }else{
                tail.next = newNode;
                tail = tail.next;
            }

        }

        head = (deleteMiddleNode(head));
        printList(head);

        sc.close();
    }


}
