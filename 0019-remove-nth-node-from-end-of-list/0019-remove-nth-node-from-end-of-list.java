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
    public ListNode reverseLL(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode newHead = reverseLL(head.next);
        head.next.next = head;
        head.next = null;
        
        return newHead;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        head = reverseLL(head);
        
        if(n==1){
            return reverseLL(head.next);
        }
        
        ListNode prev = null;
        ListNode curr = head;
        int count = 1;
        while(count < n){
            prev = curr;
            curr = curr.next;
            count++;
        }
        prev.next = curr.next;
        return reverseLL(head);
    }
}