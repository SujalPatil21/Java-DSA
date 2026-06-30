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
    public ListNode reverseList(ListNode head) {

        ListNode temp = head;
        ListNode prev = null;
        return rev(head,temp,prev);

    }
    public ListNode rev(ListNode head,ListNode temp , ListNode prev){

        if(temp == null){
            return prev;
        }
        ListNode front = temp.next;
        temp.next = prev;
        return rev(head,front,temp);
    }
}