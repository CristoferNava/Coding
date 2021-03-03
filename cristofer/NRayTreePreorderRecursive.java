public class NRayTreePreorderRecursive {
    List<Integer> result = new ArrayList<>();
    
    public List<Integer> preorder(Node root) {
        if (root != null) {
            System.out.println(root.val);
            result.add(root.val);
            for (Node node : root.children) {
                preorder(node);
            }
        }
        return result;
    }
}

// Time: O(n) because we have to traverse all the nodes in the tree
// Space: O(h) being h the maximum depth of the tree