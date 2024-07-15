class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int size = m+n;
        int [] num = new int[size];
        int i=0;
        int j=0;
        int k=0;
        
        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                num[k++] = nums1[i++];   
            }
            else{
                num[k++] = nums2[j++];
            }
        }
        while(i<m){
            num[k++] = nums1[i++];
        }
        while(j<n){
            num[k++] = nums2[j++];
        }
        
        for(int a=0; a<size; a++){
            nums1[a] = num[a];
        }
        
        }
    
    }
