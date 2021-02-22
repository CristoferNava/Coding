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

public class BFS_Traversal {
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

        search(root);
    }

    public static void search(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node r = queue.remove();
            System.out.printf("%d ", r.data);
            if (r.left != null) queue.add(r.left);
            if (r.right != null) queue.add(r.right);
        }
    }
}