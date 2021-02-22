public class RangeSumBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        if (root == null) return sum;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            TreeNode r = queue.remove();
            if (r.val >= low && r.val <= high) sum += r.val;
            if (r.left != null) queue.add(r.left);
            if (r.right != null) queue.add(r.right);
        }
        
        return sum;
        
        // Time: O(n) since we have to traverse all the nodes of the tree
        // Space: O(n) sinve in the worst case we have to save all the nodes in the queue
    }
}