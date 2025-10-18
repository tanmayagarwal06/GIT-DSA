package Linkedlist;

public class Delete {
     public static Node Remove(Node head, int position){
        if (head == null) {
            return null;
        }

        if (position == 0) {
            return head.next;
    
        }

        Node current = head; // Start from head
        int count = 0;

        // Move the node just before the position 
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }
        if (current == null || current.next == null){
            return head;
        }

        current.next = current.next.next; // Skipping the positiom

        return head;
    }
}
