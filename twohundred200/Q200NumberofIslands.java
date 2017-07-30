package leetcode.twohundred200;

/**
 * Created by ray on 7/30/17.
 */
public class Q200NumberofIslands {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        if(n==0) return 0;
        int m = grid[0].length;
        int count =0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(grid[i][j] == '1') {
                    findIslands(grid,i,j,m,n);
                    count++;
                }
            }
        }
        return count;
    }

    public void findIslands(char[][] grid, int i, int j,int m, int n){
        if(i<0||j<0||j>=m||i>=n||grid[i][j]!='1') return;
        grid[i][j] = '0';
        findIslands(grid,i+1,j,m,n);
        findIslands(grid,i,j+1,m,n);
        findIslands(grid,i-1,j,m,n);
        findIslands(grid,i,j-1,m,n);
    }
}
