class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        
        int n = s.length();
        
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if(c == '*'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.add(s.charAt(i));
            }
            
        }
        
        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        
        return str.reverse().toString();
    }
}