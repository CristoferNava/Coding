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
import java.lang.Math;

class Solution {
    public int getDecimalValue(ListNode head) {
        int n = 0;
        
        ListNode current = head;
        
        while (current != null) {
            n += 1;
            current = current.next;
        }
        
        int power = n - 1;
        int result = 0;
        current = head;
        
        while (current != null) {
            result += (int)Math.pow(2, power) * current.val;
            power -= 1;
            current = current.next;
        }
        
        return result;   
    }
}

// time: O(n) Tenemos que recorrer todos los nodos de la lista.
// space: O(1) No tenemos que crear estructuras extras en memoria.