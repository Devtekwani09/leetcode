class Solution {
    public int findMinDifference(List<String> timePoints) {
        boolean mins[] = new boolean[1440];
        
        for(String time : timePoints){
            int h = Integer.parseInt(time.substring(0,2));
            int m = Integer.parseInt(time.substring(3,5));
            
            int min = (h*60) + m;
            
            if(mins[min]){
                return 0;
            }
            
            mins[min] = true;
        }
        
        int prev = -1;
        int firstVal = -1;
        int minDiff = Integer.MAX_VALUE;
        
        for(int curr=0; curr<mins.length; curr++){
            if(mins[curr]){
                if(prev == -1){
                    firstVal = curr;
                    prev = curr;
                }
                else{
                    int diff = curr - prev;
                    minDiff = Math.min(minDiff, diff);
                    prev = curr;
                }
            }
        }
        if(prev != -1){
            int diff =  (1440 + firstVal) - prev;
            minDiff = Math.min(minDiff, diff);
        }
        
        return minDiff;
    }
}