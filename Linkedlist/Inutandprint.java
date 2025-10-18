package Linkedlist;

import java.util.Scanner;

public class Inutandprint {
    
    public static Node Input(){
        Scanner s = new Scanner(System.in);    // Create a scanner
        int data = s.nextInt();     // input head

        Node head = null;         // let head is null

        while (data != -1) {
            Node currentNode = new Node(data);       // enter the data till -1
            
            if (head == null) {
                head = currentNode;        // update the head everytime
            }
            else{
                Node tail = head;       // traverse till tail
                while (tail.next != null) {
                    tail = tail.next;    // update tail untill it is null
                }
                tail.next = currentNode;    
            }
            data = s.nextInt();   // enter the next data 
        }
        return head;
    }

    public static void print(Node head){
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = Input();
        print(head);
    }
}
