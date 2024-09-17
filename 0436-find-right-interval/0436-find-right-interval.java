class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int [] ans = new int[n];
        
        // if(n <= 1){
        //     return -1;
        // }
        
        for(int i=0; i<n; i++){
            int idx = -1;
            int minInterval = Integer.MAX_VALUE;
            
            for(int j=0; j<n; j++){
                if(intervals[i][1] <= intervals[j][0] && intervals[j][0] < minInterval){
                    minInterval = intervals[j][0];
                    idx = j;
                }
            }
            
            ans[i] = idx;
        }
        return ans;
        
    }
}