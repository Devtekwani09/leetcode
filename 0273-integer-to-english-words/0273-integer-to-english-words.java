class Solution {
    String belowTen [] = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
    String belowTwenty[] = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String belowHundred[] = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    public String numberToWords(int num) {
        if(num == 0){
            return "Zero";
        }
        else if(num < 10){
            return belowTen[num];
        }
        else if(num<20){
            return belowTwenty[num-10];
        }
        else if(num<100){
            return belowHundred[num/10] + (num%10!=0 ? " " + belowTen[num%10] : "");
        }
        else if(num<1000){//9 99
            return belowTen[num/100] + " Hundred" + (num%100!=0 ? " " + numberToWords(num%100) : "");
        }
        else if(num<1000000){//999 999
            return numberToWords(num/1000) + " Thousand" + (num%1000!=0 ? " " + numberToWords(num%1000) : "");
        }
        else if(num<1000000000){//999 999999
            return numberToWords(num/1000000) + " Million" +(num%1000000!=0 ? " " + numberToWords(num%1000000) : "");
        }
        else{ 
            return numberToWords(num/1000000000) + " Billion" + (num%1000000000!=0 ? " " + numberToWords(num%1000000000): "");
        }
    }
}