public class BinaryTreeTraversal {
    public static void main() {

    }   

    public static void inOrder(TreeNode node) {
        // Visits the left branch, then the current node, and finally the
        // right branch.
        if (node != null) {
            inOrder(node.left);
            // visit(node);
            inOrder(node.right);
        }
    }
}