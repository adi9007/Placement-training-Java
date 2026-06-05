public class deletioninlinkedlist {

    private Node head;

    // Node class
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Append method
    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Display method
    public void display() {
        Node current = head;

        System.out.print("Linked List: ");

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    // =========================
    // 1. Delete from Beginning
    // =========================
    public void deleteFromStart() {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        head = head.next;
    }

    // =========================
    // 2. Delete from End
    // =========================
    public void deleteFromEnd() {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // If only one node exists
        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;

        // Traverse to second last node
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    // =========================
    // 3. Delete from Middle
    // =========================
    public void deleteFromMiddle() {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // If only one node exists
        if (head.next == null) {
            head = null;
            return;
        }

        Node slow = head;
        Node fast = head;
        Node prev = null;

        // Find middle node
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Delete middle node
        prev.next = slow.next;
    }

    // Main method
    public static void main(String[] args) {

        deletioninlinkedlist list = new deletioninlinkedlist();

        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);

        // Original List
        list.display();

        // Delete from Start
        list.deleteFromStart();
        list.display();

        // Delete from End
        list.deleteFromEnd();
        list.display();

        // Delete from Middle
        list.deleteFromMiddle();
        list.display();
    }
}