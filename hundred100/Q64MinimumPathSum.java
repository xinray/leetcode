package leetcode.seventy70;

/**
 * Created by ray on 7/9/17.
 */
public class Q64MinimumPathSum {
    public class Solution {
        public int minPathSum(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if(i==0 && j!=0) {
                        grid[i][j] = grid[i][j] + grid[i][j-1];
                    } else if(j==0 && i!=0) {
                        grid[i][j] = grid[i][j] + grid[i-1][j];
                    } else if(j==0 && i==0) {
                        grid[i][j] = grid[i][j];
                    } else {
                        grid[i][j] = Math.min(grid[i-1][j],grid[i][j-1])+ grid[i][j];
                    }

                }
            }
            return grid[m-1][n-1];
        }
    }
}
