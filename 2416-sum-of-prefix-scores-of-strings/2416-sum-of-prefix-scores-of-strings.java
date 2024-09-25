class Node{
    Node child[];
    int count;
    Node(){
        child = new Node[26];
        count = 0;
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
            int index = ch - 'a';
            
            if(temp.child[index] == null){
                temp.child[index] = new Node();
            }
            
            temp.child[index].count++;
            
            temp = temp.child[index];
        }
    }
    
    public int countPrefix(String word){
        Node temp = root;
        
        int count = 0;
        for(char ch : word.toCharArray()){
            int index = ch - 'a';
            
            count += temp.child[index].count;
            temp = temp.child[index];
        }
        return count;
    }
}

class Solution {
    public int[] sumPrefixScores(String[] words) {
        Trie trie = new Trie();
        int ans[] = new int [words.length];
        for(String word : words){
            trie.addWord(word);
        }
        
        for(int i=0; i<words.length; i++){
            String word = words[i];
            ans[i] = trie.countPrefix(word);
        }
        
        return ans;
    }
}