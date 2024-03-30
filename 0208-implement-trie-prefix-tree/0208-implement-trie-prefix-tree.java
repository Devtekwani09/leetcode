class Trie {
    class Node{
        Node child[];
        boolean eow;
        
        public Node(){
            child = new Node[26];
            for(int i=0; i<26; i++){
                child[i] = null;
            }
            
            eow = false;
        }
    }
    
    Node root;
    
    public Trie() {
        root = new Node();
    }
    
    public void insert(String word) {
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int indx = word.charAt(i) - 'a';
            
            if(curr.child[indx] == null){
                curr.child[indx] = new Node();
            }
            if(i == word.length()-1){
                curr.child[indx].eow = true;
            }
            
            curr = curr.child[indx];
        }
    }
    
    public boolean search(String word) {
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int indx = word.charAt(i) - 'a';
            
            if(curr.child[indx] == null){
                return false;
            }
            
            if(i == word.length()-1 &&  curr.child[indx].eow == false){
                return false;
            }
            
            curr = curr.child[indx];
        }
        
        return true;
    }
    
    public boolean startsWith(String prefix) {
        Node curr = root;
        for(int i=0; i<prefix.length(); i++){
            int indx = prefix.charAt(i) - 'a';
            if(curr.child[indx] == null){
                return false;
            }
            
            curr = curr.child[indx];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */