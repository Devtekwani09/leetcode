class Solution {
    public int numDifferentIntegers(String word) {
        String [] arr = word.replaceAll("[a-z]", " ").split(" ");
        
        HashSet<String> set = new HashSet<>();
        
        for(String str : arr){
            if(!str.isEmpty()){
                set.add(str.replaceAll("^0*", ""));
            }
        }
        return set.size();
        
        
    }
}