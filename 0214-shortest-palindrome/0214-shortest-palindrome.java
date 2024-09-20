class Solution {
    public String shortestPalindrome(String s) {
        int n = s.length();
        String revStr = new StringBuilder(s).reverse().toString();
        
        String newStr = s + "*" + revStr;
        
        int arr[] = new int[newStr.length()];
        
        int i=0;
        int j=1;
        
        while(j<newStr.length()){
            if(newStr.charAt(i) == newStr.charAt(j)){
                arr[j] = i+1;
                i++;
                j++;
            }
            
            else{
                if(i>0){
                    i = arr[i-1];
                }
                else{
                    arr[j] = 0;
                    j++;
                }
            }
        }
        
        int app = n - arr[newStr.length() - 1];
        
        return revStr.substring(0,app) + s;
        
        
    }
}