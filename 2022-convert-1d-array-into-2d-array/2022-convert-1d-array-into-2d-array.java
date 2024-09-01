class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        
        if(m*n != original.length){
            return new int [0][0];
        }
        
        int res[][] = new int [m][n];
        int i=0;
        while(i<m){
            res[i] = Arrays.copyOfRange(original, i*n, i*n+n);
            i++;
        }
        
        return res;
    }
}