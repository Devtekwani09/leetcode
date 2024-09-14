class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int count = 0;
        int ans = 0;
        
        for(int num : nums){
            if(num == max) count++;
            
            else if(num > max){
                count = 1;
                ans = 1;
                max = num;
            }
            
            else{
                count = 0;
            }
            
            ans = Math.max(count, ans);
        }
        
        return ans;
    }
}