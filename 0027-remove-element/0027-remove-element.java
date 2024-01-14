class Solution {
    public int removeElement(int[] nums, int val) {
        int newsize = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[newsize] = nums[i];
                newsize++;
            }
    }
    
    return newsize;
}
}