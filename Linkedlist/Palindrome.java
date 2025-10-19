package Linkedlist;

import java.util.Scanner;

public class Palindrome {
    
    /* 
     * Input
     * Reverse
     * Check for palindrome 
     */

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

    public static boolean isPalindrome(Node head){
        /*
         * Step 1 use tortise and hare method
         * step 2 reverse the second half of the linked list
         * step 3 compare the linked list
         */
         Node slow = head;
         Node fast = head;

         while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
         }

         Node secondhalf = Reverse(slow);

         Node firsthalf = head;
         Node tempSecondhalf = secondhalf;

         while (tempSecondhalf != null) {
            if (firsthalf.data != tempSecondhalf.data) {
                return false;
            }
            firsthalf = firsthalf.next;
            tempSecondhalf = tempSecondhalf.next;
         }
         return true;
    }

    public static void main(String[] args) {
        Node head = Input();
        boolean result = isPalindrome(head);
        System.out.println(result);
    }

}
