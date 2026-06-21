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
    public void reorderList(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // here reverse should start
        fast = slow.next;
        ListNode prev = null;
        ListNode temp;

        while (fast != null) {
            temp = fast.next;
            fast.next = prev;
            prev = fast;
            fast = temp;
        }

        // breaking first list
        slow.next = null;

        // prev is starting of second list (reversed)
        // head is starting of first list

        int x = 0;

        while (prev != null && head != null) {
            if (x == 0) {
                temp = head.next;
                head.next = prev;
                head = temp;
                x = 1;
            } else {
                temp = prev.next;
                prev.next = head;
                prev = temp;
                x = 0;
            }
        }
    }
}
