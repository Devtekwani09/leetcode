class Solution {
    public  void mergeSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        
        int mid = si + (ei-si) / 2;
        
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        
        conquer(arr, si, mid, ei);
    }
    
    public void conquer(int arr[], int si, int mid, int ei){
        int merge [] = new int[ei - si + 1];
        
        int idx1 = si;
        int idx2 = mid+1;
        
        int i = 0;
        while(idx1 <= mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                merge[i++] = arr[idx1++];
            }
            else{
                merge[i++] = arr[idx2++];
            }
        }
        
        while(idx1 <= mid){
            merge[i++] = arr[idx1++];
        }
        while(idx2 <= ei){
            merge[i++] = arr[idx2++];
        }
        
        for(int j=0, k=si; j<merge.length; j++, k++){
            arr[k] = merge[j];
        }
    }
    
    public int[] sortArray(int[] nums) {
        if(nums.length <= 1){
            return nums;
        }
        
        mergeSort(nums, 0, nums.length -1);
        return nums;
    }
}