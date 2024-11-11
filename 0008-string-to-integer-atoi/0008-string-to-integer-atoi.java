class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int index = 0;
        int num = 0;
        int sign = 1;
        
        if (n==0){
            return 0;
        }
        
        while(index < n && s.charAt(index) == ' '){
            index++;
        }
        
        if(index < n && (s.charAt(index) == '-' || s.charAt(index) == '+')){
            sign = s.charAt(index) == '-' ? -1 : 1;
            index++;
        }
        
        while(index < n){
            int digit = s.charAt(index) - '0';
            if(digit < 0 || digit > 9) break;
            
            if(Integer.MAX_VALUE / 10 < num || Integer.MAX_VALUE/10 == num && Integer.MAX_VALUE %10 < digit ){
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            num = num *10 + digit;
            index++;
        }
        return num * sign;
        
    }
}