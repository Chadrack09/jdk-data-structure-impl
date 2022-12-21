package za.ac.cput.queues;

import za.ac.cput.linkedlist.EmptyListException;

/**
 *
 * @since     30 Jun 2021
 */
public class QueueTest {

    public static void main(String[] args) {
        
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(-1);
        queue.print();
        queue.enqueue(2);
        queue.print();
        queue.enqueue(23);
        queue.print();
        queue.enqueue(-1);
        queue.print();
        queue.enqueue(8);
        queue.print();
        
        try {
            
            int removedItem;
            while(true) {
                removedItem = queue.dequeue();
                System.out.printf("%n%d dequeue%n", removedItem);
                queue.print();
            }
            
        }
        catch(EmptyListException ex) {
            ex.printStackTrace();
        }
        
    }
    
}