class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int directions[][] = {{0,1},{1,0},{0,-1},{-1,0}};
        int currPos [] = {0,0};
        int currDir = 0;
        int res = 0;
        
        HashMap <Integer, HashSet<Integer>> obstacleMap = new HashMap<>();
        
        for(int[] obstacle : obstacles){
            if(!obstacleMap.containsKey(obstacle[0])){
                obstacleMap.put(obstacle[0], new HashSet<>());
            }
            
            obstacleMap.get(obstacle[0]).add(obstacle[1]);
        }
        
        for(int command : commands){
            
            if(command == -1){
                currDir = (currDir+1) % 4;
                continue;
            }
            
            if(command == -2){
                currDir = currDir - 1;
                if(currDir == -1){
                    currDir = 3;
                }
                continue;
            }
            
            int []direction = directions[currDir];
            
            for(int step=0; step<command; step++){
                int nextX = currPos[0] + direction[0];
                int nextY = currPos[1] + direction[1];
                
                if(obstacleMap.containsKey(nextX) && obstacleMap.get(nextX).contains(nextY)){
                    break;
                }
                
                currPos[0] = nextX;
                currPos[1] = nextY; 
            }
            
            res = Math.max(res, ((currPos[0] * currPos[0]) + (currPos[1] * currPos[1])));
        }
        return res;
    }
}