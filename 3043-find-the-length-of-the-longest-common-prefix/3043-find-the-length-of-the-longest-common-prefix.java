class Node {
    Node child[];
    Node(){
        child = new Node[10];
    }
}

class Trie{
    Node root;
    Trie(){
        root = new Node();
    }
    
    public void addWord(String word){
        Node temp = root;
        
        for(char ch : word.toCharArray()){
            int index = ch -'0';
            
            if(temp.child[index] == null){
                temp.child[index] = new Node();
            }
            
            temp = temp.child[index];
        }
    }
    
    public int findPrefix(String word){
        int len = 0;
        Node temp = root;
        
        for(char ch : word.toCharArray()){
            int index = ch - '0';
            
            if(temp.child[index] == null){
                break;
            }
            
            temp = temp.child[index];
            len++;
        }
        
        return len;
    }
}

class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Trie trie = new Trie();
        int maxLen = 0;
        
        for(int num : arr1){
            trie.addWord(Integer.toString(num));
        }
        
        for(int num: arr2){
            int len = trie.findPrefix(Integer.toString(num));
            maxLen = Math.max(maxLen, len);
        }
        
        return maxLen;
    }
}