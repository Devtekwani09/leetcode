class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        
        for(int i=1; i<10; i++){
            if(i>n){
                break;
            }
            dfs(i, n, ans);
        }
        
        return ans;
    }
    
    public void dfs(int currNum, int target, List<Integer> ans){
        if(currNum > target){
            return;
        }
        ans.add(currNum);
        for(int d=0; d<10; d++){
            if(currNum*10+d > target){
                break;
            }
            
            
            dfs(currNum*10+d, target, ans);
        }
    }
}