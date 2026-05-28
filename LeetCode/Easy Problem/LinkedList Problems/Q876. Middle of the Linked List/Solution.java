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
    public ListNode middleNode(ListNode head) {
        
        int size = listsize(0,head);
        int middle = size / 2 ;
        ListNode temp = head;
        for(int i = 0; i < middle; i++){
            temp = temp.next;
        }
        return temp;   

    }

    public int listsize(int size , ListNode head){


       ListNode node = head;
        while(node != null){

            node = node.next;
            size++;
        }
        return size;
    }

}