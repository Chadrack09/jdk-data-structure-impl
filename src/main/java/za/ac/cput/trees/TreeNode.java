package za.ac.cput.trees;

/**
 *
 * @since     30 Jun 2021
 */
public class TreeNode<T extends Comparable<T>> {

    TreeNode<T> leftNode;
    TreeNode<T> rightNode;
    T data;
    
    public TreeNode(T nodeData) {
        data = nodeData;
        leftNode = rightNode = null;
    }
    
    public void insert(T insertValue) {
        
        if ( insertValue.compareTo(data) < 0 ) {
            if ( leftNode == null ) {
                leftNode = new TreeNode<T>(insertValue);
            }
            else {
                leftNode.insert(insertValue);
            }
        }
        
        else if ( insertValue.compareTo(data) > 0 ) {
            if(rightNode == null) {
                rightNode = new TreeNode<T>(insertValue);
            }
            else {
                rightNode.insert(insertValue);
            }
        }
    }
}