class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = 0;
        int minDiff = Integer.MAX_VALUE;
        
        for(int i=0; i<nums.length-2; i++){
            
            int left = i+1;
            int right = nums.length - 1;
            
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                
                if(sum ==  target){
                    return target;
                }
                if(sum < target){
                    left++;
                }
                else{
                    right--;
                }
                
                int diff = Math.abs(sum - target);
                if(diff < minDiff){
                    minDiff = diff;
                    res = sum;
                }
                
            }
        }
        return res;
        
    }
}