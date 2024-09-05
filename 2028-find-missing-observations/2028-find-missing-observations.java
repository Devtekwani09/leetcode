class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int sum = mean * (m+n);
        
        for(int i=0; i<m; i++){
            sum -= rolls[i];
        }
        
        if(sum < n || sum > 6*n){
            return new int[0];
        }
        
        int avg = sum / n;
        int rem = sum % n;
        
        int ans [] = new int [n];
        for(int i=0; i<n; i++){
            ans[i]=avg;
            if(rem>0){
                ans[i]++;
                rem--;
            }
        }
        return ans;
    }
}