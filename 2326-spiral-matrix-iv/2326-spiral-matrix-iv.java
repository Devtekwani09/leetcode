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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int [][] ans = new int [m][n];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                ans[i][j] = -1;
            }
        }
        
        int rStart = 0;
        int rEnd = m-1;
        int cStart = 0;
        int cEnd = n-1;
        
        while(head!=null){
            for(int col=cStart; col<=cEnd; col++){
                if(head==null){
                    break;
                }
                ans[rStart][col] = head.val;
                head = head.next;
            }
            rStart++;
            
            for(int row=rStart; row<=rEnd; row++){
                if(head==null){
                    break;
                }
                ans[row][cEnd] = head.val;
                head = head.next;
            }
            cEnd--;
            
            for(int col=cEnd; col>=cStart; col--){
                if(head==null){
                    break;
                }
                ans[rEnd][col] = head.val;
                head = head.next;
            }
            rEnd--;
            
            for(int row=rEnd; row>=rStart; row--){
                if(head==null){
                    break;
                }
                ans[row][cStart] = head.val;
                head=head.next;
            }
            cStart++;
        }
        
        return ans;
    }
}