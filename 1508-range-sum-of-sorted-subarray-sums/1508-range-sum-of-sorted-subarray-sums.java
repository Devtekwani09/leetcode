class Solution {
    public int rangeSum(int[] nums, int t, int left, int right) {
        int n = nums.length;
        int arr[] = new int [(n*(n+1))/2];
        int k=0;
        for(int i=0; i<n; i++){
            int sum = 0;

            for(int j=i; j<n; j++){
                sum += nums[j];
                arr[k++] = sum;
            }
        }
        
        int ans = 0;
        Arrays.sort(arr);
        for(int i=left-1; i<right; i++){
            ans = (ans + arr[i]) % 1000000007;
        }
        
        return ans;
    }
}