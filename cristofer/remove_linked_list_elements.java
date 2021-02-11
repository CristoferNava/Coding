/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next; 
        }
        
        ListNode current = head;
        
        while (current != null && current.next != null) {
            if (current.next.val == val) current.next = current.next.next;
            else current = current.next;
        }
        
        return head;
    }
}

// time: O(n) puesto que tenemos que recorrer todos los nodos de la lista
// space: O(1) puesto que no estamos usando espacio extra