import java.util.Arrays;
class Solution {
    static public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[0],b[0]));

        int diff[] = new int [points.length -1];

        for(int i=0; i<diff.length; i++){
            diff[i] = points[i+1][0] - points[i][0];
        }
                
        int max = 0;

        for(int i=0; i<diff.length; i++){
            if(diff[i]>max){
                max = diff[i];
            }
        }

        return max;
    
    }
}