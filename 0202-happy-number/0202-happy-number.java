class Solution {
    public int sqOfDigits(int n){
        int sum = 0;
        while(n > 0){
            int rem = n%10;
            sum += rem*rem;
            n = n/10;
        }
        
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        
        while(n != 1){
            n = sqOfDigits(n);
            if(set.contains(n)){
                return false;
            }
            else{
                set.add(n);
            }
            
        }
        return true;
    }
}