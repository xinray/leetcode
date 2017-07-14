package leetcode.sixty60;

/**
 * Created by ray on 7/8/17.
 */
public class Q59SpiralMatrixII {
    public class Solution {
        public int[][] generateMatrix(int n) {
            int colBegin=0,rowBegin = 0;
            int colEnd = n-1,rowEnd = n-1;
            int[][] num = new int[n][n];

            int i = 1;
            while(colBegin<=colEnd && rowBegin<=rowEnd) {
                for(int j = colBegin;j<=colEnd;j++) {
                    num[rowBegin][j] =  i;
                    i++;
                }
                rowBegin++;

                for(int j = rowBegin;j<=rowEnd;j++) {
                    num[j][colEnd] =  i;
                    i++;
                }
                colEnd--;

                if(rowBegin<=rowEnd) {
                    for(int j = colEnd;j>=colBegin;j--) {
                        num[rowEnd][j] =  i;
                        i++;
                    }
                    rowEnd--;
                }

                if(colBegin<=colEnd) {
                    for(int j = rowEnd;j>=rowBegin;j--) {
                        num[j][colBegin] =  i;
                        i++;
                    }
                    colBegin++;
                }
            }
            return num;
        }
    }
}
