class Solution {
    public int romanToInt(String s) {
        HashMap <Character, Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        
        int sum = 0;
        int prevSum = 0;
        
        for(int i=s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            int currSum = roman.get(c);
            if(currSum<prevSum){
                sum -= currSum;
            }
            else{
                sum += currSum;
            }
            prevSum = currSum;
        }
        
         return sum;
    }
       
}