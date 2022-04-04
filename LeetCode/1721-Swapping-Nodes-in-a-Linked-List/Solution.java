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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode p1 = new ListNode();
        ListNode p2 = new ListNode();
        ListNode curr1 = new ListNode();
        ListNode curr2 = new ListNode();
        curr1 = head;
        curr2 = head;
        p1 = head;
        p2 = head;
        int i = 1;
        while (curr1.next != null && curr1 != null) {
            curr1 = curr1.next;
            if (i == k - 1)
                p1 = curr1;
            if (i >= k)
                curr2 = curr2.next;
            if (curr1.next == null)
                p2 = curr2;
            i++;
        }
        int temp = p1.val;
        p1.val = p2.val;
        p2.val = temp;
        return head;
    }
}