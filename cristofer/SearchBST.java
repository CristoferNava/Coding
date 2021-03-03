public class SearchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (root.val == val) return root;
            if (val < root.val) root = root.left;
            else root = root.right;
        }        
        return null;
    }
    // Time: O(log n) searching in a BST
    // Space: O(1)
}