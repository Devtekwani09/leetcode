class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack<>();
        
        if(s.length()%2 != 0){
            return false;
        }
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(c =='(' || c == '{' || c == '['){
                st.push(c);
            }
            
            else if(c == ')'){
                if(st.isEmpty()){
                    return false;
                }
                else if(st.peek() == '('){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            
            else if(c == '}'){
                if(st.isEmpty()){
                    return false;
                }
                else if(st.peek() == '{'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            
            else if(c == ']'){
                if(st.isEmpty()){
                    return false;
                }
                else if(st.peek() == '['){
                    st.pop();
                }
                else{
                    return false;
                }
            } 
            
        }
        
         if(!st.isEmpty()){
                return false;
            }
        
        return true;
        
    }
}