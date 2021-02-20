import java.util.Queue;
import java.util.LinkedList;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class DFS_Traversal {
    public static void main(String[] args) {
        //      9
        //  4       20
        // 1  6   15  170
        var root = new Node(9);
        root.left = new Node(4);
        root.right = new Node(20);
        root.left.left = new Node(1);
        root.left.right = new Node(6);
        root.right.left = new Node(15);
        root.right.right = new Node(170);

        // preorder: 9 4 1 6 20 15 170
        // inorder: 1 4 6 9 15 20 170
        // postorder: 1 6 4 15 170 20 9
        search(root);
    }

    public static void search(Node root) {
        if (root == null) return;
        System.out.printf("%d ", root.data);
        search(root.left);
        search(root.right);
    }
}