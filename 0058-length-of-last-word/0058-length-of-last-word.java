class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int index = s.length()-1;
        
        while(s.charAt(index) == ' '){
            index--;
        }
        
        for(int i=index; i>=0; i--){
            if(s.charAt(i) != ' '){
                length++;
            }
            else{
                return length;
            }
        }
        return length;
    }
}