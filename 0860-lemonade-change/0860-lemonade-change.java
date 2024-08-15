class Solution {
    public boolean lemonadeChange(int[] bills) {
        int ten = 0;
        int five = 0;
        
        if(bills.length < 1){
            return true;
        }
        
        if(bills[0] != 5){
            return false;
        }
        
        for(int i=0; i<bills.length; i++){
            if(bills[i] == 5){
                five++;
            }
            else if(bills[i] == 10){
                if(five < 1){
                    return false;
                }
                five--;
                ten++;
            }
            else{
                if(ten > 0 && five > 0){
                    ten--;
                    five--;
                }
                else if(five>2){
                    five -= 3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
        
    }
}