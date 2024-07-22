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
    
    public int helperLeft(TreeNode root){
        int depth = 1;
        while(root.left != null){
            root = root.left;
            depth++;
        }
        return depth;
    }
    
    public int helperRight(TreeNode root){
        int depth = 1;
        while(root.right != null){
            root = root.right;
            depth++;
        }
        return depth;
    }
    
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftHeight = helperLeft(root);
        int rightHeight = helperRight(root);
        
        if(leftHeight == rightHeight){
            int nodes = (int)Math.pow(2, leftHeight) - 1;
            return nodes;
        }
        
        return 1 + countNodes(root.left) + countNodes(root.right);
        
    }
    
    
}