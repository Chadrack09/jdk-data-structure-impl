package za.ac.cput.trees;

import java.security.SecureRandom;

/**
 *
 * @since     30 Jun 2021
 */
public class TreeTest {

    public static void main(String[] args) {
        
        Tree<Integer> tree = new Tree<Integer>();
        SecureRandom randomN = new SecureRandom();
        
        System.out.println("Inserting following values");
        
        for (int i = 0; i < 10; i++) {
            int value = randomN.nextInt(100);
            System.out.printf("%d ", value);
            tree.insertNode(value);
        }
        System.out.printf("%n%nPreorder traversal%n");
        tree.preorderTraversal();
        
        System.out.printf("%n%nInorder traversal%n");
        tree.inorderTraversal();
        
        System.out.printf("%n%nPostorder traversal%n");
        tree.postorderTraversal();
        System.out.println("");
        
    }
    
}