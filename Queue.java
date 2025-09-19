package CS210;

public class Queue {
    private int maxSize;    // Maximum size of the queue
    private long[] queueArray; // Array to hold queue elements
    private int front;      // Index of the front element
    private int rear;       // Index of the rear element
    private int itemCount;  // Number of elements currently in the queue

    // Constructor to initialize the queue
    public Queue(int size) {
        maxSize = size;           // Set the maximum size
        queueArray = new long[maxSize]; // Initialize the array
        front = 0;                // Front starts at 0
        rear = -1;                // Rear starts before the array
        itemCount = 0;            // Queue starts empty
    }

    // Check if the queue is full
    public boolean isFull() {
        return itemCount == maxSize;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return itemCount == 0;
    }

    // Insert an item at the rear of the queue
    public boolean insert(long item) {
        if (isFull()) {
            return false; // Return false if the queue is full
        }
        // Handle wraparound for the rear index
        if (rear == maxSize - 1) {
            rear = -1;
        }
        rear++;                     // Move rear forward
        queueArray[rear] = item;    // Insert the item
        itemCount++;                // Increment the item count
        return true;                // Insertion successful
    }

    // Remove and return the item at the front of the queue
    public Long remove() {
        if (isEmpty()) {
            return null; // Return null if the queue is empty
        }
        long removedItem = queueArray[front]; // Get the front item
        front++;                              // Move front forward
        // Handle wraparound for the front index
        if (front == maxSize) {
            front = 0;
        }
        itemCount--;                          // Decrement the item count
        return removedItem;                   // Return the removed item
    }
}
