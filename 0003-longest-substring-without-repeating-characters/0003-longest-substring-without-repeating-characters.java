class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ws = 0;
        int we = 0;
        int n = s.length();
        int length = Integer.MIN_VALUE;
        HashSet<Character> set = new HashSet<>();
        
        while(we < n){
            char ch = s.charAt(we);
            if(set.contains(ch)){
                while(ws<we && set.contains(ch)){
                    set.remove(s.charAt(ws));
                    ws++;
                }
            }
            
            set.add(ch);
            length = Math.max(length, set.size());
            we++;
        }
        return (length == Integer.MIN_VALUE)? 0 : length;
    }
}