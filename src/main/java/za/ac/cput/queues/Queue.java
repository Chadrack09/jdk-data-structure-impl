package za.ac.cput.queues;

import za.ac.cput.linkedlist.EmptyListException;
import za.ac.cput.linkedlist.List;

/**
 *
 * @since     30 Jun 2021
 */
public class Queue<T> {
    
    private List<T> queueList;
    
    public Queue() {
        queueList = new List<T>("queue");
    }
    
    public void enqueue(T object) {
        queueList.insertAtBack(object);
    }
    
    public T dequeue() throws EmptyListException {
        return queueList.removeFromFront();
    }
    
    public boolean isEmpty() {
        return queueList.isEmpty();
    }
    
    public void print() {
        queueList.print();
    }
        
}