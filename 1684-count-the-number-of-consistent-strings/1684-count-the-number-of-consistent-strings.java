class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        
        HashSet<Character> set = new HashSet<>();
        
        for(int i=0; i<allowed.length(); i++){
            set.add(allowed.charAt(i));
        }
        
        for(String word : words){
            boolean flag = true;
            for(int i=0; i<word.length(); i++){
                if(!set.contains(word.charAt(i))){
                    flag = false;
                }
            }
            if(flag){
                count++;
            }
        }
        return count;
        
    }
}