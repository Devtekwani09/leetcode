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
    
    public ListNode reverseLL(ListNode node){
        ListNode prev = null;
        ListNode curr = node;
        
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
        }
        
        return prev;
    }
    
    public ListNode removeNodes(ListNode head) {
        if(head == null){
            return head;
        }
        
        
        ListNode curr = reverseLL(head);
        
        ListNode newHead = new ListNode(curr.val);
        int max = curr.val;
        
        
        while(curr.next != null){
            curr = curr.next;
            if(max <= curr.val){
                ListNode newNode = new ListNode(curr.val);
                newNode.next = newHead;
                newHead = newNode;
                max = newHead.val;
            }
        }
        
        return newHead;
    }
}