class Solution {
    public int minSwaps(int[] nums) {
        int ws = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                ws++;
            }
        }
        
        int currZeros = 0;
        for(int i=0; i<ws; i++){
            if(nums[i] == 0){
                currZeros++;
            }
        }
        
        System.out.print(currZeros);
        
        int minZeros = currZeros;
        int start = 0;
        int end = ws-1;
        
        while(start < nums.length){
            if(nums[start] == 0){
                currZeros--;
            }
            start++;
            end++;
            if(nums[end%nums.length] == 0){
                currZeros++;
            }
            System.out.print(currZeros);
            
            minZeros = Math.min(minZeros, currZeros);
             
        }
        return minZeros;
    }
}