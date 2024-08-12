class Solution {
    public String reverseWords(String s) {
        String str = s.trim();
        String words[] = str.split("\\s+");
        String ans = "";
        
        for(int i=words.length-1; i>=0; i--){
            ans = ans + words[i];
            if(i!=0){
                ans = ans + " ";
            }
        }
        return ans;
    }
}