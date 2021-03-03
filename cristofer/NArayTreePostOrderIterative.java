public class NArayTreePostOrderIterative {
    public List<Integer> postorder(Node root) {
        var stack = new LinkedList<Node>();
        var result = new ArrayList<Integer>();
        
        if (root == null) return result;
        stack.add(root);
        
        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            result.add(node.val);
            for (Node child : node.children) {
                stack.add(child);
            }
        }
        
        Collections.reverse(result);
        return result;
    }
}

// Time: O(n) we have to traverse all the nodes in the tree
// Space: O(n) we have to build the result array that it contain n integers