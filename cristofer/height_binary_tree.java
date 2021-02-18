public static int height(Node root) {
    if (root == null) return -1;
    return 1 + Math.max(height(root.left), height(root.right));
}

// Time: O(n) since we have to traverse all the nodes
// Space: O(h) being h the eight of the three since the maximun number of calls
//        int the stack is the largest path, that is the eight.