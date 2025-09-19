package CS210;

public class PriorityQueue {
    private int maxSize;       // Maximum size of the priority queue
    private long[] queueArray; // Array to hold elements
    private int itemCount;     // Number of elements currently in the queue

    // Constructor
    public PriorityQueue(int size) {
        maxSize = size;             // Set the maximum size
        queueArray = new long[size]; // Initialize the array
        itemCount = 0;              // Queue starts empty
    }

    // Check if the priority queue is full
    public boolean isFull() {
        return itemCount == maxSize;
    }

    // Check if the priority queue is empty
    public boolean isEmpty() {
        return itemCount == 0;
    }

    // Insert an item into the priority queue
 // Insert an item into the priority queue
    public void insert(int item) {
        if (isFull()) {
            throw new IllegalStateException("Priority Queue is full.");
        }

        int j = itemCount; // Start at the end of the queue

        // Shift elements to the right to make space for the new item
        while (j > 0 && queueArray[j - 1] > item) {
            queueArray[j] = queueArray[j - 1];
            j--;
        }

        // Insert the new item at its correct position
        queueArray[j] = item;

        itemCount++; // Increment the count of items
    }

    // Remove and return the highest-priority item (smallest element)
    public Long remove() {
        if (isEmpty()) {
            return null; // Return null if the queue is empty
        }
        return queueArray[--itemCount]; // Remove the last element (highest priority)
    }

    // Peek at the highest-priority item without removing it
    public Long peek() {
        if (isEmpty()) {
            return null; // Return null if the queue is empty
        }
        return queueArray[itemCount - 1]; // Peek at the last element
    }

}
