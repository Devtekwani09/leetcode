class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int count = 0;
        
        for(int i=0; i<n-2; i++){
            int first = rating[i];
            for(int j = i+1; j<n-1; j++){
                if(rating[j]>first){
                    int second = rating[j];
                    for(int k=j+1; k<n; k++){
                        if(rating[k] > second){
                            count++;
                        }
                    }
                }
            }
        }
        
        for(int i=0; i<n-2; i++){
            int first = rating[i];
            for(int j = i+1; j<n-1; j++){
                if(rating[j]<first){
                    int second = rating[j];
                    for(int k=j+1; k<n; k++){
                        if(rating[k] < second){
                            count++;
                        }
                    }
                }
            }
        }
        
        return count;
    }
}