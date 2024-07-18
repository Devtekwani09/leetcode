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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l3 = new ListNode(0);
        ListNode head = l3;
        
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                l3.next = new ListNode(list1.val);
                l3 = l3.next;
                list1 = list1.next;
            }
            else{
                l3.next = new ListNode(list2.val);
                l3 = l3.next;
                list2 = list2.next;
            }
        }
        while(list1 != null){
            l3.next = new ListNode(list1.val);
            l3 = l3.next;
            list1 = list1.next;
        }
        while(list2 != null){
            l3.next = new ListNode(list2.val);
            l3 = l3.next;
            list2 = list2.next;
        }
        return head.next;
    }
}