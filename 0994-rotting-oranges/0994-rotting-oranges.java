import java.util.*;
class Solution {
    class Node{
        int x;
        int y;
        int time;
        
        public Node(int x, int y, int time){
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<Node> q = new LinkedList<>();
        
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 2){
                    q.add(new Node(i,j,0));
                }
            }
        }
        
        int t=0;
        
        while(!q.isEmpty()){
            Node n = q.remove();
            int x = n.x;
            int y = n.y;
            t = n.time;
            
            if(x-1 >=0 && grid[x-1][y] == 1){
                grid[x-1][y] = 2;
                q.add(new Node(x-1, y, t+1));
            }
            
            if(x+1 < grid.length && grid[x+1][y] == 1){
                grid[x+1][y] = 2;
                q.add(new Node(x+1, y, t+1));
            }
            
            if(y-1 >=0 && grid[x][y-1] == 1){
                grid[x][y-1] = 2;
                q.add(new Node(x, y-1, t+1));
            }
            
            if(y+1 < grid[0].length && grid[x][y+1] == 1){
                grid[x][y+1] = 2;
                q.add(new Node(x, y+1, t+1));
            }
        }
        
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    return -1;
                }
            }
        }
        
        return t;
    }
}