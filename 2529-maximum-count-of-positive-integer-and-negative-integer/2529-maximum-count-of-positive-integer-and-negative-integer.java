class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int pos = 0;
        int neg = 0;
        for(int i=0; i<n; i++){
            if(nums[i] < 0){
                neg++;
            }
            else if(nums[i] > 0){
                pos++;
            }
        }
        int max = 0;
        if(pos >= neg){
            max = pos;
        }
        else{
            max = neg;
        }
        return max;
    }
}