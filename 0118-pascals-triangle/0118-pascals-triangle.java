class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i=0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            
            row.add(1);
            for(int j=1; j<i; j++){
                int n = list.get(i-1).get(j-1) + list.get(i-1).get(j);
                row.add(n);
            }
            
            if(i>0) row.add(1);
            
            list.add(row);
        }
        return list;
    }
}