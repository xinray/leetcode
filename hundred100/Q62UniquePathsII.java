package leetcode.seventy70;

/**
 * Created by ray on 7/9/17.
 *
 *
 * 动态规划的题目,路径相加 很有意义
 */
public class Q62UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        if(m==0||n == 0)
            return 0;

        if(obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1)
            return 0;

        int[][] depth = new int[m][n];
        depth[0][0] = 1;

        for(int i =1;i<n;i++) {
            if(obstacleGrid[0][i] == 1)
                depth[0][i] = 0;
            else
                depth[0][i] = depth[0][i-1];

        }

        for(int i =1;i<m;i++) {
            if(obstacleGrid[i][0] == 1)
                depth[i][0] = 0;
            else
                depth[i][0] = depth[i-1][0];

        }

        for(int i =1 ; i<m;i++) {
            for(int j=1;j<n;j++) {
                if(obstacleGrid[i][j] == 1) {
                    depth[i][j] = 0;
                } else {
                    depth[i][j] = depth[i-1][j] + depth[i][j-1];
                }
            }
        }


        return depth[m-1][n-1];
    }
}
