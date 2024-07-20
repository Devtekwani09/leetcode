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
    
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        
        int length = 1;
        ListNode curr = head;
        while(curr.next != null){
            curr = curr.next;
            length++;
        }
        curr.next =  head;
        
        k = k % length;
        
        for(int i=0; i<length - k; i++){
            curr = curr.next;
        }
        
        head = curr.next;
        curr.next = null;
        
        
        
//         for(int i=0; i<k; i++){
//         ListNode curr = head;
        
//         while(curr.next.next != null){
//             curr = curr.next;
//         }
        
//         ListNode prev = curr;
//         curr = curr.next;
        
//         curr.next = head;
//         prev.next = null;
//         head = curr;
//         }
        
        return head;
            
        
    }
}