class Solution {
    public boolean wordPattern(String pattern, String s) {
        String arr [] = s.split(" ");
        if(arr.length != pattern.length()){
            return false;
        }
        
        HashMap<Character, String> map = new HashMap<>();
        
        for(int i=0; i<pattern.length(); i++){
            char charP = pattern.charAt(i);
            
            if(map.containsKey(charP)){
                if(!map.get(charP).equals(arr[i])){
                    return false;
                }
            }
            else if(map.containsValue(arr[i])){
                return false;
            }
            else{
                map.put(charP, arr[i]);
            }
        }
        
        return true;
    }
}