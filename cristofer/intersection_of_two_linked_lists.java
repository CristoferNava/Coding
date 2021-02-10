/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int aLength = getLength(headA); // t(m)
        int bLength = getLength(headB); // t(n)
        
        ListNode longest;
        ListNode shortest;
        int n;
        if (aLength >= bLength) {
            longest = headA;
            shortest = headB;
            n = aLength - bLength;
        } else {
            longest = headB;
            shortest = headA;
            n = bLength - aLength; 
        }

        for (int i = 1; i <= n; i++) {
            longest = longest.next;
        }
     

        while (shortest != null && longest != null) { // t(n) being m the shortest list
            if (shortest == longest) return shortest;
            shortest = shortest.next;
            longest = longest.next;
        }
        
        return null;
    }
    
    private int getLength(ListNode head) {
        int n = 0;
        while (head != null ) {
            n++;
            head = head.next;
        }
        return n;
    }
}

// Time: O(m + n)
// Space: O(1)