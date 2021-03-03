public class NArayTreePostOrder {
    ArrayList<Integer> result = new ArrayList<>();
    
    public List<Integer> postorder(Node root) {
        if (root != null) {
            for (Node child : root.children) {
                postorder(child);
            }
            result.add(root.val);
        }
        return result;
    }
}

// Time: O(n) we have to traverse all the nodes in the tree
// Space: O(n) we have to build the result (ArrayList with n elements)