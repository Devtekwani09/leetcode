class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }
        
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<t.length(); i++){
            char charT = t.charAt(i);
            
            if(map.containsKey(charT)){
                map.put(charT, map.get(charT) + 1);
            }
             else{
                 map.put(charT, 1);
             }
        }
        
        for(int i=0; i<s.length(); i++){
            char charS = s.charAt(i);
            
            if(map.containsKey(charS)){
                map.put(charS, map.get(charS) - 1);
                if(map.get(charS) == 0){
                    map.remove(charS);
                }
            }
             else{
                 return false;
             }
        }
        
        return true;
    }
}