package za.ac.cput.linkedlist;

/**
 *
 * @since     28 Jun 2021
 */
public class ListNode<T> {
    
    /**
     * <p>Package access members; List can access these directly
     * <p>These class-properties are actual representation of nodes in a linked
     * list, those comprises: The data value, and the pointer to the next node.
     * 
     * {@code  T data, ListNode<T> nextNode}
     */
    T data;
    ListNode<T> nextNode;
    
    
    /**
     * <p>Constructor Methods</p>
     * @param       object
     */
    public ListNode(T object) {
        this(object, null);
    }
    
    
    /**
     * <p>Constructor Methods</p>
     * @param       data
     * @param       nextNode  
     */
    public ListNode(T data, ListNode<T> nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ListNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(ListNode<T> nextNode) {
        this.nextNode = nextNode;
    }

}