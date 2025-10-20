package Linkedlist;
public class Traversingthroughlast {

    /*
     * find the length of the libked list
     * Move to the length - n -1 of the linked list
     * Disconnect the next of linked list bu puttting it equal to null
     * Join the tail of liked list to old head
     */

     public static Node appendlastNtofirst(Node head, int n){
        int length = 0;

        while (head != null) {      // length of a linked list
            length++;
            head = head.next;
        }

        if (n >= length) {
            return head;         // ot of boundary or exception case
        }

        int cutpoint = length - n - 1;
        Node current = head;

        for (int i = 0; i < cutpoint; i++) {        // traversing thorugh cutpoint
            current = current.next;

        }

        Node newhead = current.next;       //Breaking the connection
        current.next = null;

        Node tail = newhead;            // converting the old tail into head;
        while (tail.next != null) {
            tail = tail.next;
        }

        tail.next = head;

        return newhead;
     }
}
