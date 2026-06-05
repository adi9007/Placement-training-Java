public class insertioninmidlinkedlists {
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

    // 2. Insert Method (Insert in the middle)
    public void insertInMiddle(int data, int position) {
        Node newNode = new Node(data);

        // If the list is empty or position is 0, insert at the start
        if (head == null || position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Traverse to the position where the new node will be inserted
        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        // If current is null, it means position is greater than the length of the list
        if (current == null) {
            System.out.println("Position is out of bounds.");
            return;
        }

        // Insert the new node in the middle
        newNode.next = current.next;
        current.next = newNode;
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
        insertioninmidlinkedlists list = new insertioninmidlinkedlists();

        // Adding elements to the list
        list.insertInMiddle(10, 0); // Insert at start
        list.insertInMiddle(20, 1); // Insert at end
        list.insertInMiddle(15, 1); // Insert in the middle

        // Displaying the list
        list.display(); 
    }
}