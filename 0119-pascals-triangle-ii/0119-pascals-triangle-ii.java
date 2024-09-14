class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i=0; i<=rowIndex; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            
            for(int j=1; j<i; j++){
                int n = list.get(i-1).get(j) + list.get(i-1).get(j-1);
                row.add(n);
            }
            
            if(i>0) row.add(1);
            
            list.add(row);
        }
        return list.get(rowIndex);
    }
}