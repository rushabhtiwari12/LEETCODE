package Linked_List.MEDIUM;

import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LC876_Middle_Of_LinkedList {

    public static Node middleElementLL(Node head){
        // Slow and First approach
        Node s = head;
        Node f = head;
        while(f!=null && f.next != null){
            s=s.next;
            f=f.next.next;

        }
        return s;
    }

    public static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the No of Nodes");
        int n = sc.nextInt();

        System.out.println("Enter the elements inside the array");
        Node head = null;
        Node tail = null;

        for(int i =0; i<n; i++){
            int val = sc.nextInt();
            Node newNode = new Node(val);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = tail.next;
            }
        }
        head = middleElementLL(head);
        printList(head);
        sc.close();
    }
}
