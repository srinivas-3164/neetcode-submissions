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
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode sp = head;
        ListNode fp = head;

        while (sp != null && fp != null) {
            sp = sp.next;
            if (fp.next == null) {
                continue;
            }
            fp = fp.next.next;

             if (sp == fp) {
                return true;
            }
        }

        return false;
    }
}
