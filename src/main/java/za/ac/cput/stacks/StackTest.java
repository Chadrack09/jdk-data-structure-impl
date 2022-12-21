package za.ac.cput.stacks;

import za.ac.cput.linkedlist.EmptyListException;

/**
 *
 * @since     30 Jun 2021
 */
public class StackTest {

    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.print();
        stack.push(45);
        stack.print();
        stack.push(-2);
        stack.print();
        stack.push(-4);
        stack.print();
        
        try {
            
            int removedItem;
            while(true) {
                removedItem = stack.pop();
                System.out.printf("%n%d popped%n", removedItem);
                stack.print();
            }
            
        }
        catch(EmptyListException ex) {
            ex.printStackTrace();
        }
        
    }
    
}