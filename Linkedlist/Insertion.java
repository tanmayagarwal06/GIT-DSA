package Linkedlist;

public class Insertion {
    
    public static void Insertion(Node head, int number, int position){
        Node insertNode = new Node(number);

        if (position == 0 ) {
            insertNode.next = head;
            head = insertNode;
            return;
        }
        int count = 0;
        Node prev = head;

        while (count < position - 1 && prev != null) {
            prev = prev.next;
            count++;

        }

        if (prev == null ) {
            System.out.println("Out of bound");
            return;
        }

        insertNode.next =prev.next;
        prev.next = insertNode;

    }
}
