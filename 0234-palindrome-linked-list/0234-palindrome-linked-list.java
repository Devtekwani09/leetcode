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
    
    public ListNode reverse(ListNode head){
        if(head==null || head.next == null){
            return head;
        }
        
        ListNode newhead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        
        return newhead;
    }
    
    public ListNode findMiddle(ListNode head){
        ListNode hear = head;
        ListNode turtle = head;
        
        while(hear.next != null && hear.next.next != null){
            hear = hear.next.next;
            turtle = turtle.next;
        }
        
        return turtle;
    }
    
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        
        ListNode middle = findMiddle(head); //to find the end of 1st half
        ListNode secHead = reverse(middle.next);
        ListNode firstHead = head;
        
        while(secHead != null){
            if(firstHead.val != secHead.val){
                return false;
            }
            firstHead = firstHead.next;
            secHead = secHead.next;
        }
        return true;
    }
}