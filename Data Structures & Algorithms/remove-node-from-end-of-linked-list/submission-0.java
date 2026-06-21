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
    public ListNode removeNthFromEnd(ListNode head, int n) {
            if (head.next == null) {
                return n == 1 ? null: head;
            }

            int len = 0;
            ListNode temp = head;
            while (temp != null) {
                len++;
                temp = temp.next;
            }

            int i = 0;
            int req = len - n;

            if (req == 0) {
                return head.next;
            }
            ListNode prev = new ListNode(-1);
            temp = head;
            while (temp != null) {
                if (i == req) {
                    prev.next = temp.next;
                    break;
                }
                prev = temp;
                temp = temp.next;
                i++;
            }

            return head;
    }
}
