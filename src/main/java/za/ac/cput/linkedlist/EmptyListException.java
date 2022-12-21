package za.ac.cput.linkedlist;

/**
 *
 * @since     28 Jun 2021
 */
public class EmptyListException extends RuntimeException {
    
    public EmptyListException() {
        this("list");
    }
    
    public EmptyListException(String name) {
        super(name + "is empty");
    }
    
}