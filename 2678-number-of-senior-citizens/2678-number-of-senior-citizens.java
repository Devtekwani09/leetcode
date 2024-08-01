class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        
        for(int i=0; i<details.length; i++){
            String str = details[i];
            System.out.println(str);
            String age =  str.substring(11, 13);
            System.out.println(age);
            int ageInNumber = Integer.parseInt(age);
            System.out.println(ageInNumber);
            if(ageInNumber > 60){
                count++;
            }
        }
        
        return count;
    }
}