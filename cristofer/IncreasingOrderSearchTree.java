public class IncreasingOrderSearchTree {
    TreeNode current;
    public TreeNode increasingBST(TreeNode root) {
        var result = new TreeNode(0);
        current = result;
        inOrder(root);
        return result.right;
    }
    
    public void inOrder(TreeNode node) {
        if (node != null) {
            inOrder(node.left);
            node.left = null;
            current.right = node;
            current = node;
            inOrder(node.right);
        }
    } 
}

// Time Complexity: O(n) we are traversing all the nodes in the tree.
// Space Complexity: O(h) h is maximum depth of the tree, because we are using DFS 