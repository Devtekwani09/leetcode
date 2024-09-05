class Solution {
    public boolean isVowel(char c){
        char ch = Character.toLowerCase(c);
        if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
    
    public void swap(char str[], int start, int end){
        char temp = str[start];
        str[start] = str[end];
        str[end] = temp;
    }
    
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int n = str.length;
        int start = 0;
        int end = n-1;
        
        while(start < end){
            while(start < end && !isVowel(str[start])){
                start++;
            }
            while(end > start && !isVowel(str[end])){
                end--;
            }
            
            if(start < end){
                swap(str, start, end);
                start++;
                end--;
            }
        }
        
        return new String(str);
        
    }
}