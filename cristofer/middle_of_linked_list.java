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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
}
// usamos dos apuntadores, slow y fast, por cada paso que da slow fast da 2
// con esto cuando fast terminé de recorrer la lista slow va a estar en el medio
// time: O(n) puesto que tenemos que recorrer la mitad de n y n/2 = n
// space: O(1) no estamos ocupando estructuras extra.