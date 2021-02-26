public class MaximumDepthBinaryTree {
    public int maxDepth(Node root) {
        if (root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        return Math.max(left, right);
    }
}

// Time Complexity: O(n) since we are traversing all the nodes in the tree.
// Space Complexity: O(n) because in the call stack the maximum number of calls
//                   could be n if the tree is not balanced.