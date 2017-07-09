package leetcode.sixty60;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ray on 7/8/17.
 *
 *
 * 难点在于 边界条件的判断 以及 边界条件的控制
 *
 *
 */
public class Q54SpiralMatrix {
    public class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> in = new ArrayList<Integer>();
            if(matrix.length == 0) return in;

            int rowBegin = 0;
            int rowEnd = matrix.length-1;
            int colBegin = 0;
            int colEnd = matrix[0].length-1;

            while (rowBegin <= rowEnd && colBegin  <= colEnd) {
                for(int j = colBegin;j<=colEnd;j++) {
                    in.add(matrix[rowBegin][j]);
                }
                rowBegin++;

                for(int j = rowBegin;j<=rowEnd;j++) {
                    in.add(matrix[j][colEnd]);
                }
                colEnd--;

                if (rowBegin <= rowEnd) {
                    for (int j = colEnd; j >= colBegin; j --) {
                        in.add(matrix[rowEnd][j]);
                    }
                }
                rowEnd--;

                if (colBegin <= colEnd) {
                    for (int j = rowEnd; j >= rowBegin; j --) {
                        in.add(matrix[j][colBegin]);
                    }
                }
                colBegin ++;


            }

            return in;
        }
    }
}
