
/**
 * Write a description of interface BSTVisitorB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface BSTVisitorI
{
    /**
     * An example of a method header - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the result produced by sampleMethod 
     */
    int caseLeaf();
    
    int caseBranch(BinarySearchTree left, int v, BinarySearchTree right);
}