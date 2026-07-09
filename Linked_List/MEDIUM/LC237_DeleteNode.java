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

public class LC237_DeleteNode {
    

    public static void deleteNode(Node node){
        if(node == null || node.next == null){
            return ;
        }

        node.data = node .next.data;
        node.next = node.next.next;
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
        System.out.println("Enter the no of nodes");
        int n = sc.nextInt();


        Node head = null;
        Node tail = null;

        for(int i =0; i<n;i++){
            int value = sc.nextInt();
            Node newNode = new Node(value);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        System.out.println("Enter the value of the node to be deleted");
        int deleteNode = sc.nextInt();

        Node temp = head;
        while(temp !=null){
            if(temp.data == deleteNode){
                deleteNode(temp);
                break;
            }
            temp = temp.next;
        }

        printList(head);

        sc.close();



    }

}
