// Given an array of elements, our task is to construct a complete binary tree
// from this array in level order fashion.

class Node {
    int data;
    Node left, right;
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class ArrayToBinaryTree {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Node result = arrayToTree(arr);
        inOrder(result);
    }

    public static Node arrayToTree(int[] array) {
        Node root = null;
        Node result = arrayToTree(root, array, 0);
        return result;
    }

    public static Node arrayToTree(Node root, int[] array, int i) {
        if (i < array.length) {
            root = new Node(array[i]);
            root.left = arrayToTree(root.left, array, 2*i+1);
            root.right = arrayToTree(root.right, array, 2*i+2);
        }
        return root;
    }

    public static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.printf("%d ", root.data);
            inOrder(root.right);
        }
    }
}

// Time Complexity: O(n) since we have to traverse all the nodes.
// Space Complexity: O(n) since the tree built has n nodes.