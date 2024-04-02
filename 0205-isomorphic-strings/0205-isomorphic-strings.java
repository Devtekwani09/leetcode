class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> st =new HashMap<>();
        HashMap<Character, Character> ts =new HashMap<>();
        
        if(s.length() != t.length()){
            return false;
        }
        
        for(int i=0; i<s.length(); i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            if(st.containsKey(charS)){
                if(st.get(charS) != charT){
                    return false;
                }
            }
            else{
                st.put(charS,charT);
            }
            
            if(ts.containsKey(charT)){
                if(ts.get(charT) != charS){
                    return false;
                }
            }
            else{
                ts.put(charT,charS);
            }
        }
        return true;
    }
}