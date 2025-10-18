package Linkedlist;

public class TortiseandHaremethod {
    public static Node Center(Node head){
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {     // Tortoise and Hare method
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
}
}

