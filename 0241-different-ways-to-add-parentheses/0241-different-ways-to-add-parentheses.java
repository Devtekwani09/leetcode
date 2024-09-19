class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        return recc(expression, 0, expression.length()-1);
    }
    
    public List<Integer> recc(String exp, int start, int end){
        List<Integer> ans = new ArrayList<>();
        
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
            
            List<Integer> left = recc(exp, start, i-1);
            List<Integer> right = recc(exp, i+1, end);
            
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
        
        return ans;
    }
}