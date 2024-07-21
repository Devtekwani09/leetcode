/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null){
            return null;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node prev;
        
        while(!queue.isEmpty()){
            int n = queue.size();
            prev = null;
            for(int i=0; i<n; i++){
                Node top = queue.remove();
                top.next = prev;
                prev = top;
                
                if(top.right != null){
                    queue.add(top.right);
                }
                if(top.left != null){
                    queue.add(top.left);
                }
            }  
        }
        return root;
    }
}