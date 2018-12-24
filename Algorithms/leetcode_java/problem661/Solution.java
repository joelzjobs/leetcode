package leetcode_java.problem661;

class Solution {
    public int[][] imageSmoother(int[][] M) {
        int m = M.length;
        int n = M[0].length;
        int[][] result = new int[m][n];
        
        for(int r = 0; r < m; r++){
            for(int c = 0; c < n; c++){
                int count = 0;
                for(int i = r-1; i < r+2; i++){
                    for(int j = c-1; j < c+2; j++){
                        if(i>=0 && i<m && j>=0 && j<n){
                            result[r][c] += M[i][j];
                            count++;
                        }
                    }
                }
                result[r][c] /= count;
            }
        }
        return result;
    }
}