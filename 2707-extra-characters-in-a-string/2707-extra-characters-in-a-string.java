class Solution {
    int dp[] = new int[50];
    public int minExtraChar(String s, String[] dictionary) {
        int n = s.length();
        Arrays.fill(dp, -1);
        HashSet<String> set = new HashSet<>(Arrays.asList(dictionary));
        
        return reccFun(s, set, 0);
    }
            
    public int reccFun(String s, HashSet<String> set, int index){
        if(index == s.length()){
                return 0;
            }
        
        if(dp[index] != -1){
            return dp[index];
        }
            
            StringBuilder sb = new StringBuilder();
            int minExtraCharacter = Integer.MAX_VALUE;
            
            for(int i=index; i<s.length(); i++){
                sb.append(s.charAt(i));
                
                int extraChar = 0;
                
                if(!set.contains(sb.toString())){
                    extraChar += sb.length();
                }
                
                int extrachar2 = reccFun(s, set, i+1);
                minExtraCharacter = Math.min(minExtraCharacter,extraChar + extrachar2);
            }
        return dp[index] = minExtraCharacter;
        }
    }
