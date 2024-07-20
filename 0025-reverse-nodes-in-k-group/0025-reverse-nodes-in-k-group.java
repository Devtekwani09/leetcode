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
        if(head == null || head.next == null){
            return head;
        }
        ListNode node = head;
        int count = 0;
        while(node != null && count < k){
            node = node.next;
            count++;
        }
        
        if(count < k){
            return head;
        }
        
        
        
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        
        
        
        while(curr != null && count > 0){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count-- ;
        }
        
        if(next != null){
            head.next = reverseKGroup(next, k);
        } 
        
        return prev;
        
    }
}