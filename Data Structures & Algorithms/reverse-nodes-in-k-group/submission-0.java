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
    public ListNode reverseKGroup(ListNode head, int k) {
      if (head == null || k == 1)
            return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        while (true) {
            ListNode temp = prev;
            for (int i = 0; i < k; i++) {
                temp = temp.next;
                if (temp == null)
                    return dummy.next;
            }
            ListNode tail = prev.next;
            ListNode current = tail;
            ListNode previous = null;
            for (int i = 0; i < k; i++) {
                ListNode next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }
            prev.next = previous;
            tail.next = current;
            prev = tail;
        }   
    }
}
