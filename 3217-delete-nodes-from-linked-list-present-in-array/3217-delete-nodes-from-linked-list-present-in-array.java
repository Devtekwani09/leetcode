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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : nums){
            set.add(num);
        }
        
        ListNode curr = head;
        ListNode prev = null;
        
        while(curr != null){
            if(set.contains(curr.val)){
                //if node is head node
                if(prev == null){
                    head = head.next;
                    curr.next = null;
                    curr = head;
                }
                //if not a head node
                else{
                    prev.next = curr.next;
                    curr.next = null;
                    curr = prev.next;
                }
            }
            else{
                prev = curr;
                curr = curr.next;
            }
        }
        
        return head;
    }
}