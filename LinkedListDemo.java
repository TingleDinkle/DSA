// =============================================================
// Figures 1–10: Singly Linked List — Insert, Delete, Traverse
// =============================================================

class Node {
    int info;
    Node next;

    // Figure 1: Singly-linked list node
    Node(int data) {
        this.info = data;
        this.next = null;
    }
}

public class LinkedListDemo {

    // ---- Figure 2: Insert at the beginning ----
    static Node insertAtFront(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    // ---- Figure 2: Print function ----
    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.info + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // ---- Figure 5: Delete at first ----
    static Node deleteAtFirst(Node head) {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return null;
        }
        Node temp = head;
        head = head.next;
        temp = null; // help GC
        return head;
    }

    // ---- Figure 8: Traverse function ----
    static void traverse(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.info);
            current = current.next;
        }
    }

    // ---- Main function covering Figures 3, 6, 9 ----
    public static void main(String[] args) {

        // ==== Part 1: Insert at front (Figures 3 & 4) ====
        System.out.println("=== Insert at Front ===");
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        System.out.print("Before insert: ");
        printList(head);

        int x = 0;
        head = insertAtFront(head, x);

        System.out.print("After inserting " + x + " at front: ");
        printList(head);
        // Output: 0 -> 1 -> 2 -> 3 -> null

        System.out.println();

        // ==== Part 2: Delete at first (Figures 6 & 7) ====
        System.out.println("=== Delete at First ===");
        Node head2 = new Node(8);
        head2.next = new Node(10);
        head2.next.next = new Node(15);
        head2.next.next.next = new Node(20);

        System.out.print("Before deletion: ");
        printList(head2);

        head2 = deleteAtFirst(head2);

        System.out.print("After deleting first node: ");
        printList(head2);
        // Output: 10 -> 15 -> 20 -> null

        System.out.println();

        // ==== Part 3: Traverse (Figures 9 & 10) ====
        System.out.println("=== Traverse ===");
        Node head3 = new Node(10);
        head3.next = new Node(20);
        head3.next.next = new Node(30);
        head3.next.next.next = new Node(40);

        traverse(head3);
        // Output:
        // 10
        // 20
        // 30
        // 40
    }
}
