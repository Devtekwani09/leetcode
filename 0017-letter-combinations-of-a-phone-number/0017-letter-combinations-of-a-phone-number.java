class Solution {
    
    private void solve(String digits, String output, int index, List<String> ans, String mapping[] ){
        //base case
        if(index >= digits.length()){
            ans.add(output);
            return;
        }
        
        int number = digits.charAt(index) - '0';
        String value = mapping[number];
        
        for(int i=0; i<value.length(); i++){
            output = output + value.charAt(i);
            solve(digits,output,index+1, ans, mapping);
            output = output.substring(0, output.length() - 1);
        }
    }
    
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits == null || digits.isEmpty()){
            return ans;
        }
        String output = "";
        int index = 0;
        String mapping[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        solve(digits, output, index, ans, mapping);
        return ans;
        
    }
}