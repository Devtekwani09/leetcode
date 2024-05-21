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
        int size = 0;
        ListNode mover = head;
        
        while(mover != null){
            size ++;
            mover = mover.next;
        }
        
        if(size%2 == 0){
            int mid = size/2;
            for(int i=0; i<mid; i++){
                head = head.next;
            }
        }
        else{
            int mid = (size+1) / 2;
            for(int i=0; i<mid-1; i++){
                head = head.next;
            }
        }
        return head;
    }
}