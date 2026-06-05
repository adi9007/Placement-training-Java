public class insertioninstartlinkedlist {
    private Node head;

    // 1. The Node Class
    // A static inner class is used to define the node structure.
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // 2. Insert Method (Insert at the start)
    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        
        // Point the new node's next to the current head
        newNode.next = head;
        
        // Update head to the new node
        head = newNode;
    }

    // 3. Display Method
    public void display() {
        Node current = head;
        
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next; // Move to the next node
        }
        System.out.println("null");
    }

    // 4. Main Method to test the code
    public static void main(String[] args) {
        insertioninstartlinkedlist list = new insertioninstartlinkedlist();

        // Adding elements to the list at the start
        list.insertAtStart(10);
        list.insertAtStart(20);
        list.insertAtStart(30);
        list.insertAtStart(40);

        // Displaying the list
        list.display(); 
    }
}
