import java.util.*;
class Solution {
    public String removeOuterParentheses(String s) {
        String res = "";
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                if(st.isEmpty()){
                    st.push(s.charAt(i));
                }
                else{
                    st.push(s.charAt(i));
                    res = res + s.charAt(i);
                }
            }
            else{
                st.pop();
                if(!st.isEmpty()){
                    res = res + s.charAt(i);
                }
            }
        }
        return res;
    }
}