package Linkedlist;

import java.util.Scanner;

public class Duplicate {


    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public static Node<Integer> removeDuplicate(Node<Integer> head){
        Node<Integer> temp = head;

        if (head == null || head.next == null) {
        return head;
    }

    while (temp != null && temp.next != null) {
        if (temp.data.equals(temp.next.data)) {
            temp.next = temp.next.next;
        }
        else{
            temp  = temp.next;
        }
    }
    return head;

}

public static Node<Integer> Input(){
        Scanner s = new Scanner(System.in);    // Create a scanner
        int data = s.nextInt();     // input head

        Node<Integer> head = null;         // let head is null

        while (data != -1) {
            Node<Integer> currentNode = new Node<>(data);       // enter the data till -1
            
            if (head == null) {
                head = currentNode;        // update the head everytime
            }
            else{
                Node<Integer> tail = head;       // traverse till tail
                while (tail.next != null) {
                    tail = tail.next;    // update tail untill it is null
                }
                tail.next = currentNode;    
            }
            data = s.nextInt();   // enter the next data 
        }
        return head;
    }

    public static void print(Node<Integer> head){
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head = Input();
        print(head);
        removeDuplicate(head);
        System.out.println("after deleting the duplicate");
        print(head);
    }

}