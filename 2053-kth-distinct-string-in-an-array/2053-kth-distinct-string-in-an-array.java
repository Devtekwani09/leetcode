class Solution {
    public boolean isDistinct(String[] arr, int a){
        for(int i=0; i<arr.length; i++){
            if(i != a && arr[i].equals(arr[a])){
                return false;
            }
        }
        return true;
    }
    public String kthDistinct(String[] arr, int k) {
        int n = arr.length;
        int count = 0;
        
        for(int i=0; i<n; i++){
            if(isDistinct(arr, i)){
                count++;
            }
            
            if(count == k){
                return arr[i];
            }
        }
        
        return "";
    }
}