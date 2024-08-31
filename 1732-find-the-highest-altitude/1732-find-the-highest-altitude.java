class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int currPoint = 0;
        int n = gain.length;
        
        for(int i=0; i<n; i++){
            currPoint += gain[i];
            if(currPoint > max){
                max = currPoint;
            }
        }
        
        return max;
    }
}