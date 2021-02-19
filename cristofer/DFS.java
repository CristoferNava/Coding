// In DFS, we visit a node A and then iterate through each of A' neighbors.
// When visiting a node B that is a neighbor of A, we visit all of B's neighbors
// before going on to A's other neighbors. That is, a exhaustively searches 
// B's branch before any of its other neighbors.
// Preorder, postorder, inorder are a form of DFS. They key difference is that
// when implementing this algorithm for a graph, we must check if the node has
// been visited. If we don't, we risk getting stuck in an infinite loop.

public class DFS {
    // pseudocode for DFS
    void search(Node root) {
        if (root == null) return;
        visit(root);
        root.visited = true;
        for each (Node n in root.adjacent) {
            if (n.visited == false) {
                search(node);
            }
        }
    }
}