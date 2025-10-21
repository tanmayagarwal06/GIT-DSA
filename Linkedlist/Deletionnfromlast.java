package Linkedlist;

import java.lang.classfile.components.ClassPrinter.ListNode;

class Deletionnfromlast { 

    /*
     * Length of a linked list
     * Iliterate till length - n
     * temp.nest = temp.next.next
     */



    public Node removeNthFromEnd(Node head, int n) {
        // Step 1: Find the length
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        // If we have to remove the first node
        if (length == n) {
            return head.next;
        }

        // Step 2: Find (length - n - 1)th node
        int stepsToMove = length - n - 1;
        temp = head;
        for (int i = 0; i < stepsToMove; i++) {
            temp = temp.next;
        }

        // Step 3: Skip the node
        temp.next = temp.next.next;

        return head;
    }

     public Node removeNthFromEndusingtwopointers(Node head, int n) {

        /*
         * create a dummy node
         * start bothslo0w and fast from there with fast moving n + 1
         * fast = fast.next and slow = slow.next
         * Delete the node
         */

        
        
        Node dummy = new Node(0);
        dummy.next = head;

        Node fast = dummy;
        Node slow = dummy;

     
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        
        slow.next = slow.next.next;

        
        return dummy.next;
    }
}
