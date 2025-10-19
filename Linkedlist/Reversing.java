package Linkedlist;

import java.util.Scanner;

public class Reversing {

    public static Node Reverse(Node head) {
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev; // new head of the reversed list
    }

    public static Node Input() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        Node head = null;

        while (data != -1) {
            Node temp = new Node(data);

            if (head == null) {
                head = temp;
            } else {
                Node tail = head;
                while (tail.next != null) {
                    tail = tail.next;
                }
                tail.next = temp;
            }

            data = s.nextInt();
        }
        return head;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = Input();
        head = Reverse(head); // fix here
        print(head);
    }
}
