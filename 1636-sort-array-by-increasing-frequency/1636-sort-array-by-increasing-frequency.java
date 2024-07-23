class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        
        Integer temp[] = new Integer [map.size()];
        int i=0;
        for(Integer key : map.keySet()){
            temp[i] = key;
            i++;
        }
        Arrays.sort(temp, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                if(map.get(a) == map.get(b)){
                    return b - a;
                }
                 return map.get(a) - map.get(b);
            }
        });
        
        i=0;
        for(Integer key : temp){
            int freq = map.get(key);
            for(int j=0; j<freq; j++){
                nums[i] = key;
                i++;
            }
        }
        
        return nums;
            
    }
}