class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int n = tokens.length;
        
        for(int i=0; i<n; i++){
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")){
               
                st.push(Integer.parseInt(tokens[i]));
            }
            
            else{
                int a = st.pop();
                int b = st.pop();
                
                if(tokens[i].equals("+")){
                    st.push(a+b);
                }
                else if(tokens[i].equals("-")){
                    st.push(b-a);
                }
                else if(tokens[i].equals("*")){
                    st.push(a*b);
                }
                else{
                    st.push(b/a);
                }
            }
            
        }
        
        int ans = st.pop();
        
        return ans;
    }
}