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
    
    private int start = 0;
    
    public TreeNode constructTree(int[] preorder, int[] inorder, int si, int ei){
        if(si>ei){
            return null;
        }
        
        
        
        TreeNode root = new TreeNode(preorder[start++]);
        
        int k = 0;
        for(int i=si; i<=ei; i++ ){
            if(inorder[i] == root.val){
                k = i;
                break;
            }
        }
        
        root.left = constructTree(preorder, inorder, si, k-1);
        root.right = constructTree(preorder, inorder, k+1, ei);
        
        return root;
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        if(n <= 0){
            return null;
        }
        
        return constructTree(preorder, inorder, 0, n-1);
        
    }
}