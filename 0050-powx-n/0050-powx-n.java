class Solution {
    public double myPow(double x, long n) {
        if(n==0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        
        if(x> 1e-5 && x< -1e-5){
            return 0;
        }
        
    
        if(n<0){
            x = 1/x;
            n = -n;
        }
        
        double result = myPow(x, n/2);
        
        if (n%2 == 0){
            return (result * result);
        }
        else{
            return (result * result) * x;
        }
    }
}