public class NAryTreePreorder {
    public List<Integer> preorder(Node root) {
        var stack = new LinkedList<Node>();
        var result = new ArrayList<Integer>();
        
        if (root == null) return result;
        
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            result.add(node.val);
            Collections.reverse(node.children);
            for (Node child : node.children) {
                stack.add(child);
            }
        }
        return result;
    }
}
// Time: O(n) we have to traverse all the nodes in the tree.
// Space: O(n) we build a new array that contains n Integers, one for each node in the array