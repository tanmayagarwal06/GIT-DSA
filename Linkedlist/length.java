package Linkedlist;

import java.util.Scanner;

public class length {
    
    public static Node Input(){
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        Node head = null;

        while (data != -1) {
            Node currentNode = new Node(data);

            if (head == null) {
                head = currentNode;
            }
            else{
                Node tail = head;
                while (tail.next != null) {
                    tail = tail.next;
                }
                tail.next = currentNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void print(Node head){
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static int length(Node head){
        int length = 0;
        Node currentNode = head;

        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
        }
        return length;
    }

    public static void printithnode(Node head, int i){
        int count = 0;
        Node temp = head;

        while (temp != null) {
            if (count == i) {
                System.out.println(temp.data);
                return;
            }
            temp = temp.next;
            count++;
        }
    }

    public static void main(String[] args) {
        Node head = Input();
        print(head);
        System.out.println("the length of the linked list is:");
        System.out.println(length(head));
        System.out.println("The ith node is:");
        printithnode(head, 3);
    }
}
