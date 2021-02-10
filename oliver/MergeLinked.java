import java.util.List;

public class MergeLinked {
    public class ListNode {
        int val;
        ListNode next_head;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next_head = next; }

    }

    public class Solution {
        public ListNode mergeLists(ListNode l1, ListNode l2){
            ListNode i = l1;
            ListNode j = l2;
            ListNode result;

            if(i.val <= j.val){
                result = new ListNode(i.val);
            } else {
                result = new ListNode(j.val);
            }

            ListNode k = result;

            while(i != null || j != null){
                if(i.val <= j.val){
                    k.next_head = new ListNode(i.val);
                    k = k.next_head;
                    i = i.next_head;
                } else {
                    k.next_head = new ListNode(j.val);
                    k = k.next_head;
                    i = i.next_head;
                }
            }

            return k;
        }
    }
}