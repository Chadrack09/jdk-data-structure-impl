package za.ac.cput.stacks;

import za.ac.cput.linkedlist.EmptyListException;
import za.ac.cput.linkedlist.List;

/**
 *
 * @since     30 Jun 2021
 */
public class Stack<T> extends List<T> {
    
    public Stack() {
        super("stack");
    }
    
    public void push(T object) {
        insertAtFront(object);
    }
    
    public T pop() throws EmptyListException {
        return removeFromFront();
    }
    
}