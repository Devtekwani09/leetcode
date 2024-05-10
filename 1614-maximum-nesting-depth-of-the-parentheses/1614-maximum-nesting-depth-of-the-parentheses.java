class Solution {
    public int maxDepth(String s) {
        int ans = 0;
        Stack <Character> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                st.push(c);
            }
            else if(c == ')'){
                st.pop();
            }
            
            ans = Math.max(ans, st.size());
        }
        
        return ans;
    }
}