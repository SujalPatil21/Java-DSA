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
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) {
            return null;
        }
        int size = listSize(0, head);
        int middle = size / 2;
        ListNode temp = head;

        for (int i = 0; i < middle - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;

    }

    public int listSize(int size, ListNode head) {

        ListNode node = head;

        while (node != null) {

            node = node.next;
            size++;
        }
        return size;
    }
}