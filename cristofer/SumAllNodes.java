class Node {
    int data;
    Node left;
    Node right;
    public Node(int value) {
        this.data = value;
    }
}

public class SumAllNodes {
    static int sum = 0;
    public static void main(String[] args) {
        var root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right = new Node(15);
        root.right.right = new Node(18);

        int result = rangeSumBST(root, 7, 15);
        System.out.println(result);
    }

    public static int rangeSumBST(Node root, int low, int high) {
        if (root == null) return 0; 
        if (root.data >= low && root.data <= high) {
            // System.out.println(root.data);
            return root.data + rangeSumBST(root.left, low, high) 
                             + rangeSumBST(root.right, low, high);
        }
        return 0 + rangeSumBST(root.left, low, high) +
                   rangeSumBST(root.right, low, high);
        
    }
}