class Solution {
    int row;
    int col;
    public void dfs(int grid[][], int r, int c, int [][]seen){
        if(r<0 || r>=row || c<0 || c>=col || grid[r][c] == 0 || seen[r][c] == 1){
            return;
        }
        seen[r][c] = 1;
        
        dfs(grid, r+1, c, seen);
        dfs(grid, r-1, c, seen);
        dfs(grid, r, c+1, seen);
        dfs(grid, r, c-1, seen);
        
    }
    
    public int noOfIslands(int grid[][]){
        int [][] seen = new int[row][col];
        int islands = 0;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == 1 && seen[i][j] == 0){
                    
                    dfs(grid, i,j, seen);
                    islands++;
                }
            }
        }
        return islands;
    }
    
    public int minDays(int[][] grid) {
        row = grid.length;
        col = grid[0].length;
        int num = noOfIslands(grid);
        System.out.print(num);
        if(noOfIslands(grid) != 1){
            return 0;
        }
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == 1){
                    grid[i][j] = 0;
                    if(noOfIslands(grid) != 1){
                        return 1;
                    }
                    grid[i][j] = 1;
                }
                
            }
        }
        
        return 2;
    }
}