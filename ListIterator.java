package CS210;

class ListIterator {
    private Link current; // Points to the current node
    private Link previous; // Points to the previous node
    private LinkedList ourList; // Reference to the linked list

    public ListIterator(LinkedList list) { // Constructor
        ourList = list;
        reset();
    }

    public void reset() { // Set iterator to the start of the list
        current = ourList.getFirst(); // Points to the first node
        previous = null;
    }

    public void nextLink() { // Move to the next link
        previous = current;
        current = current.next;
    }
    
    ////

    public Link getCurrent() { // Get the current link
        return current;
    }

    public void insertAfter(int data) { // Insert a node after the current node
        Link newLink = new Link(data);

        if (ourList.isEmpty()) { // If the list is empty
            ourList.insertHead(data);
        } else {
            newLink.next = current.next;
            current.next = newLink;
        }
    }

    public void deleteCurrent() { // Delete the current node
        if (previous == null) { // If at the head
            ourList.deleteHead();
        } else {
            previous.next = current.next;
        }
        current = current.next;
    }
    
    
    public boolean atEnd() { // Check if at the end of the list
        return (current == null);
    }

}
