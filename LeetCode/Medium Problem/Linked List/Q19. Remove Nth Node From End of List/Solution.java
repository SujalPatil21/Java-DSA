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
        
        if(head == null ){
            return head;
        }
            int size = findn(head);
             if(size == n){
            return head.next;
        }

    
        int pos = size - n;
    
        ListNode temp = head;
        for(int i = 1 ; i < pos ; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }


    public int findn(ListNode head){

        ListNode temp = head;
        int size = 0;
        while(temp != null){

            temp = temp.next;
            size++;
        }

        return size ;
    }
}