class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i=0; i<nums1.length; i++){
            set1.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            set2.add(nums2[i]);
        }
        
        List<Integer> subList1 = new ArrayList<>();
        for(int n : set1){
            if(!set2.contains(n)){
                subList1.add(n);
            }
        }
        
        List<Integer> subList2 = new ArrayList<>();
        for(int n : set2){
            if(!set1.contains(n)){
                subList2.add(n);
            }
        }
        
        list.add(subList1);
        list.add(subList2);
        
        return list;
    }
}