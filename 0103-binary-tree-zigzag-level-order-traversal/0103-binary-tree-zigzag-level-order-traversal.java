/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        
        if(root == null){
            return list;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = true;
        
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> inlist = new ArrayList<>();
            for(int i=0; i<n; i++){
                TreeNode curr = q.remove();
                
                if(flag){
                    inlist.addLast(curr.val);
                }
                else{
                    inlist.addFirst(curr.val);
                }
                
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            list.add(inlist);
            flag = !flag;
        }
        return list;
    }
}