import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int merged [] = new int[nums1.length + nums2.length];
        int k=0;
        for(int i=0; i<nums1.length; i++){
            merged[k++] = nums1[i];
        }
        
        for(int i=0; i<nums2.length; i++){
            merged[k++] = nums2[i];
        }
        
        Arrays.sort(merged);
        
        if(merged.length % 2 == 0){ //even size
            int mid1 = merged[(merged.length / 2) -1];
            int mid2 = merged[(merged.length / 2)];
            return (double) (mid1 + mid2)/2;
        }
        else{
            return (double) merged[merged.length / 2];
        }
    }
}