class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        int k = 0;
        String str = "";
        while(i < word1.length() && j < word2.length()){
            if(k%2==0){
                str = str + word1.charAt(i++);
            }
            else{
                str = str + word2.charAt(j++);
            }
            k++;
        }
        
        while(i<word1.length()){
            str += word1.charAt(i++);
        }
        
        while(j<word2.length()){
            str += word2.charAt(j++);
        }
        
        return str;
        
    }
}