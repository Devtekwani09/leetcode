class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int merged[] = new int[n+m];
        int k=0;
        while(i<m && j<n){
            if(nums1[i] <= nums2[j]){
                merged[k++] = nums1[i++];
            }
            else{
                merged[k++] = nums2[j++]; 
            }
        }
        
        while(i<m){
            merged[k++] = nums1[i++];
        }
        
        while(j<n){
            merged[k++] = nums2[j++];
        }
        
        for (int a = 0; a < merged.length; a++) {
            nums1[a] = merged[a];
        }
    }
}