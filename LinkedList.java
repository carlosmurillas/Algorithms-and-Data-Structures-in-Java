package CS210;

// Class representing a doubly linked list
class LinkedList {
    private Link first; // Reference to the first node in the list
    private Link last;  // Reference to the last node in the list

    // Constructor: Initializes an empty list
    public LinkedList() {
        first = null;
        last = null;
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return first == null;
    }

    // Insert a new node at the head of the list
    public void insertHead(int data) {
        Link newLink = new Link(data); // Create a new node
        newLink.next = first;          // Point the new node's "next" to the current first node

        if (isEmpty()) {
            last = newLink; // If the list was empty, the new node is also the last node
        } else {
            first.previous = newLink; // Update the current first node's "previous" to the new node
        }

        first = newLink; // Update "first" to point to the new node
    }

    // Insert a new node in sorted order
    public void insertOrdered(int data) {
        Link newLink = new Link(data); // Create a new node
        Link current = first;         // Start from the head

        // Traverse to find the correct position
        while (current != null && data > current.data) {
            current = current.next;
        }

        // Case 1: Insertion at the head
        if (current == first) {
            insertHead(data);
        }
        // Case 2: Insertion at the tail
        else if (current == null) {
            insertTail(data);
        }
        // Case 3: Insertion in the middle
        else {
            newLink.previous = current.previous;
            current.previous.next = newLink;
            newLink.next = current;
            current.previous = newLink;
        }
    }

    // Insert a new node at the tail of the list
    public void insertTail(int data) {
        Link newLink = new Link(data); // Create a new node

        if (isEmpty()) {
            first = newLink; // If the list is empty, the new node is also the first node
        } else {
            last.next = newLink;  // Point the current last node's "next" to the new node
            newLink.previous = last; // Point the new node's "previous" to the current last node
        }

        last = newLink; // Update "last" to point to the new node
    }

    // Delete the first node in the list
    public Link deleteHead() {
        if (isEmpty()) {
            return null; // Nothing to delete
        }

        Link temp = first;     // Store the current first node
        first = first.next;    // Move "first" to the next node

        if (first == null) {
            last = null; // If the list is now empty, set "last" to null
        } else {
            first.previous = null; // Remove reference to the deleted node
        }

        return temp; // Return the deleted node
    }

    // Delete a node with a specific key
    public Link delete(long key) {
        Link current = first; // Start at the head

        // Traverse to find the node with the given key
        while (current != null && current.data != key) {
            current = current.next;
        }

        if (current == null) {
            return null; // Key not found
        }

        // Case 1: Deleting the first node
        if (current == first) {
            first = current.next;
        } else {
            current.previous.next = current.next;
        }

        // Case 2: Deleting the last node
        if (current == last) {
            last = current.previous;
        } else {
            current.next.previous = current.previous;
        }

        return current; // Return the deleted node
    }

    // Display all nodes in the list
    public void display() {
        Link current = first; // Start from the head
        System.out.print("List: ");
        while (current != null) {
            current.displayLink(); // Display the data of the current node
            current = current.next; // Move to the next node
        }
        System.out.println();
    }

    // Get the first node in the list
    public Link getFirst() {
        return first;
    }
}

