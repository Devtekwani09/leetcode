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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = 0;
        ListNode temp = head;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        
        ListNode res[] = new ListNode[k];
        temp = head;
        int avg = n / k;
        int extra = n % k;
        
        for(int i=0; i<k; i++){
            if(temp == null){
                break;
            }
            
            ListNode curr = temp;
            ListNode prev = null;
            int len = 0;
            
            while(len < avg && temp != null){
                prev = temp;
                temp = temp.next;
                len++;
            }
            
            if(extra > 0){
                prev = temp;
                temp = temp.next;
                extra--;
            }
            
            prev.next = null;
            res[i] = curr;
        }
        return res;
    }
}