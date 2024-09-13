class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int prefix[] = new int[arr.length];
        
        int pre = arr[0];
        prefix[0] = pre;
        
        for(int i=1; i<arr.length; i++){
            pre ^= arr[i];
            prefix[i] = pre;
        }
        
        int ans[] = new int[queries.length];
        
        for(int i=0; i<queries.length; i++){
            int left = queries[i][0];
            int right = queries[i][1];
            
            if(left == 0){
                ans[i] = prefix[right];
            }
            else{
                ans[i] = prefix[right] ^ prefix[left-1];
            }   
        }
        return ans;
    }
}