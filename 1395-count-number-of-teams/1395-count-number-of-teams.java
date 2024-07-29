class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int count = 0;
        
        for(int mid = 1; mid<n-1; mid++){
            int leftMinCount = 0;
            int rightMaxCount = 0;
            
            for(int i=0; i<mid; i++){
                if(rating[i] < rating[mid]){
                    leftMinCount++;
                }
            }
            
            for(int i=mid+1; i<n; i++){
                if(rating[i] > rating[mid]){
                    rightMaxCount++;
                }
            }
            
            count += leftMinCount * rightMaxCount;
            
            int leftMaxCount = mid - leftMinCount;
            int rightMinCount = n-mid-1 - rightMaxCount;
            
            count += leftMaxCount * rightMinCount;
            
            
        }
        
        return count;
    }
}