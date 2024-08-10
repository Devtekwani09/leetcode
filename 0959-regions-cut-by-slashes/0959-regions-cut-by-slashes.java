class Solution {
    int rows;
    int cols;
    
    public void dfs(int r , int c, int[][]matrix){
        //out of bound or curr value ==1
        if(r<0 || r>=rows || c<0 || c>=cols || matrix[r][c]==1){
            return;
        }
        matrix[r][c] = 1;
        
        dfs(r+1,c,matrix);
        dfs(r-1,c,matrix);
        dfs(r,c+1,matrix);
        dfs(r,c-1,matrix);
    }
    
    public int regionsBySlashes(String[] grid) {
        int n = grid.length;
        rows = n*3;
        cols = n*3;
        int matrix [][] = new int[rows][cols];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int row = i*3;
                int col = j*3;
                if(grid[i].charAt(j) == '/'){
                    matrix[row][col+2] = 1;
                    matrix[row+1][col+1] = 1;
                    matrix[row+2][col] = 1;
                }
                else if(grid[i].charAt(j) == '\\'){
                    matrix[row][col] = 1;
                    matrix[row+1][col+1] = 1;
                    matrix[row+2][col+2] = 1;
                }
            }
        }
        
        int count = 0;
        for(int i=0; i<n*3; i++){
            for(int j=0; j<n*3; j++){
                if(matrix[i][j] == 0){
                    dfs(i,j,matrix);
                    count++;
                }
            }
        }
        
        return count;
    }
}