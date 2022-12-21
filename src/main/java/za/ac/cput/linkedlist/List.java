package za.ac.cput.linkedlist;

/**
 *
 * @since     28 Jun 2021
 * @see       List<T>
 * 
 * <p>This class represents an entire list class with some operations features
 * like {@link #insertAtBack}, {@link #removeFromBack()}, {@link #print()}
 * 
 * These methods helps the list class or object to execute certain operation.
 * 
 */
public class List<T> {
    
    
    /**
     * 
     * These operations can perform at high speed
     * <p>Properties that will perform in main time.
     * 
     */
    private ListNode<T> firstNode;
    private ListNode<T> lastNode;
    private String name;
    
    
    public List() {
        this("list");
    }
    
    public List(String listName) {
        name = listName;
        firstNode = lastNode = null;
    }
    
    
    /**
     * <p>This method was implemented to insert values or data from 
     * the List, commonly use when instantiated the methods.
     * 
     * @param       insertItem
     * 
     */
    public void insertAtFront(T insertItem) {
        if ( isEmpty() ) {
            firstNode = lastNode = new ListNode<T> (insertItem);
        }
        else firstNode = new ListNode<T> (insertItem, firstNode);
    }
    
    public void insertAtBack(T insertItem) {
        if(isEmpty()) {
            firstNode = lastNode = new ListNode<T>(insertItem);
        }
        else lastNode = lastNode.nextNode = new ListNode<T>(insertItem);
    }
    
    
    /**
     * 
     * <p>This method {@link #removeFromFront()} was implemented to remove
     * items or data from the list, return null or empty if no data in the list</p> 
     * 
     * @param       <none>
     * @throws      EmptyListException
     * @return      {@code removedItem} This variable is return after the operation
     *              was performed in the list. Some exception are thrown as well.
     */
    public T removeFromFront() throws EmptyListException {
        if ( isEmpty() ) {
            throw new EmptyListException(name);
        }
        T removedItem = firstNode.data;
        
        if( firstNode == lastNode ) {
            firstNode = lastNode = null;
        }
        else firstNode = firstNode.nextNode;
        
        return removedItem;
    }
    
    public T removeFromBack() throws EmptyListException {
        if( isEmpty() ) {
            throw new EmptyListException(name);
        }
        T removedItem = lastNode.data;
        
        if( firstNode == lastNode ) {
            firstNode = lastNode = null;
        }
        else {
            ListNode<T> current = firstNode;
            
            while (current.nextNode != lastNode) {
                current = current.nextNode;
            }
            lastNode = current;
            current.nextNode = null;
        }
        
        return removedItem;
    }
    
    
    /**
     * This method {@link #isEmpty()} this return null if no data present
     * in the list.
     * 
     */
    public boolean isEmpty() {
        return firstNode == null;
    }
    
    
    /**
     * 
     * This method {@link #print()}, prints the entire list and values in the
     * list, if no data presents, it returns null.
     * 
     * @since       1.0, JDK 11 LTS Version
     * 
     */
    public void print() {
        if( isEmpty() ) {
            System.out.printf("%nEmpty %s%n", name);
        }
        System.out.printf("The %s is: ", name);
        ListNode<T> current = firstNode;
        
        while ( current != null ) {
            System.out.printf("%s ", current.data);
            current = current.nextNode;
        }
        System.out.println("");
    }
    
}