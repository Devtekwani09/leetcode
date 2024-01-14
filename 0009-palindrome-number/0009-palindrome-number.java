class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int num = 0;
        while(x>0){
            int rem = x%10;
            num = num*10 + rem;
            x = x/10;
        }
        if(temp == num){
            return true;
        }
        else return false;
        
    }
}