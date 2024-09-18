class Solution {
    public int reverse(int x) {
        int num = 0;
        
        while(x!=0){
            int rem = x % 10;
            if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0; // overflow for positive numbers
            }
            if (num < Integer.MIN_VALUE / 10 || (num == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0; // overflow for negative numbers
            }
            
            num = (num*10) + rem;
            x = x/10;
        }
        
        return num;
    }
}