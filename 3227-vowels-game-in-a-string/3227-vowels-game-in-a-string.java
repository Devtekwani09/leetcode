class Solution {
    public boolean doesAliceWin(String s) {
        int n = s.length();
        int count = 0;
        
        for(int i=0; i<n; i++){
            if(s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                count++;
            }
        
            
        }
        if(count==0){
                return false;
            }
        
        return true;
    }
}