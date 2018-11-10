package leetcode_java.problem695;

class Solution {
    private int[][] grid;
    
    private int dfs(int i, int j){
        int m = grid.length;
        int n = grid[0].length;
        if((0 <= i) && (i < m) && (0 <= j) && (j < n) && (grid[i][j]==1)){
            grid[i][j] = 0;
            return 1 + dfs(i-1,j) + dfs(i+1,j) + dfs(i,j-1) + dfs(i,j+1);
        }
        return 0;
        }
    
    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        int m = grid.length;
        int n = grid[0].length;
        int maxArea = 0;
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(this.grid[i][j]==1){
                    int newArea = dfs(i, j);
                    maxArea = maxArea < newArea ? newArea : maxArea;
                }
            }
        }
        return maxArea;
    }
}