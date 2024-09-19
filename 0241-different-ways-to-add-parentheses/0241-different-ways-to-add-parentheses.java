class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        int n = expression.length();
        List<Integer>[][] dp = new ArrayList[n][n];
        return recc(expression, 0, n-1, dp);
    }
    
    public List<Integer> recc(String exp, int start, int end, List<Integer>[][] dp){
        List<Integer> ans = new ArrayList<>();
        
        if(dp[start][end] != null){
            return dp[start][end];
        }
        
        //single digit
        if(start == end){
            int num = exp.charAt(start) - '0';
            ans.add(num);
            return ans;
        }
        
        //double digit
        if(end-start == 1 && Character.isDigit(exp.charAt(start))){
            int num = Integer.parseInt(exp.substring(start, end+1));
            
            ans.add(num);
            return ans;
        }
        
        //split
        for(int i=start; i<=end; i++){
            if(Character.isDigit(exp.charAt(i))){
                continue;
            }
            
            char op = exp.charAt(i);
            
            List<Integer> left = recc(exp, start, i-1, dp);
            List<Integer> right = recc(exp, i+1, end, dp);
            
            for(int j: left){
                for(int k : right){
                    if(op == '*'){
                        ans.add(j*k);
                    }
                    else if(op == '-'){
                        ans.add(j-k);
                    }
                    else{
                        ans.add(j+k);
                    }
                }
            }
        }
        
        dp[start][end] = ans;
        
        return ans;
    }
}