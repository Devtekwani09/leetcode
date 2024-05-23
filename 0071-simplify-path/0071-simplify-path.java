class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack <>();
        int n = path.length();
        
        for(int i=0; i<n; i++){
            String str = "";
            
            if(path.charAt(i) == '/'){
                continue;
            }
            while(i<n && path.charAt(i) !='/'){
                str += path.charAt(i++);
            }
            if(str.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else if(!str.equals(".") && !str.equals("")){
                st.push(str);
            }
            
        }
        
        String ans = "";
        
        while(!st.isEmpty()){
            ans = '/' + st.pop() + ans;
            
        }
        
        if(ans.length() == 0){
            return "/";
        }
        return ans;
    }
}