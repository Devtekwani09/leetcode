class Solution {
    public int [] solve(int[] mapping, int[] nums){
        int [] maps = new int[nums.length];
        
        for(int i=0; i<nums.length; i++) {
            int n = nums[i];
            if(n==0){
                maps[i] = mapping[0];
                continue;
            }
            int num = 0;
            int j=0;
            while(n > 0){
                int rem = n % 10;
                num = mapping[rem]*(int)Math.pow(10,j) + num;
                n = n/10;
                j++;
            }
            maps[i] = num;
        }
        return maps;
    }
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int [] maps = solve(mapping, nums);
        Integer [] index = new Integer[nums.length];
        
        for(int i=0; i<nums.length; i++){
            index[i] = i;
        }
        
        Arrays.sort(index, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return maps[a] - maps[b];
            }
        });
        
        int [] res = new int[nums.length];
        int i=0;
        for(int idx : index){
            res[i++] = nums[idx];
        }
        
        return res;
        
    }
}