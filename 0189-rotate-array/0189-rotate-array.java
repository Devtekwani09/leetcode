class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length == 1){
            return; 
        }
        k = k % nums.length;
        reverseArray(nums, 0, nums.length-1);
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, nums.length-1);
    }
    
    public void reverseArray(int nums[], int st, int end){
        while(st <= end){
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;
            end--;
        }
    }
}