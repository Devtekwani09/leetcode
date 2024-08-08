class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int n = rows * cols;
        int[][] res = new int[n][2];
        int count = 0;
        int step = 1;

        res[count++] = new int[]{rStart, cStart};

        while (count < n) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < step; j++) {
                    rStart += dir[i][0];
                    cStart += dir[i][1];
                    if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                        res[count++] = new int[]{rStart, cStart};
                        if (count == n) return res;
                    }
                }
                if (i % 2 == 1) step++;
            }
        }
        return res;
    }
}
