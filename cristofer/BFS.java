// In BFS, node A visits each of A's neighbors before visiting any of their 
// neighborsl. You can think of this as searching level by level out from A.
public class BFS {
    void search(Node root) {
        var queue = new Queue();
        root.marked = true;
        queue.enqueue(root); // at to the end of queue

        while (!queue.isEmpty()) {
            Node r = queue.dequeue(); // Remove from the front of the queue
            visit(r);
            for each (Node n in r.adjacent) {
                if (n.marked == false) {
                    n.marked = true;
                    queue.enqueue(n);
                }
            }
        }
    }
}