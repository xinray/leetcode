import java.util.HashSet;
import java.util.Set;

/**
 * Created by wanxinrui on 2017/7/10.
 */
public class Q73SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        if(matrix==null){
            return;
        }

        int row = matrix.length;
        int col = matrix[0].length;

        Set rowZero=new HashSet();
        Set  colZero=new HashSet();

        for(int i = 0;i<row;i++) {
            for(int j=0;j<col;j++) {
            if(matrix[i][j] == 0) {
                rowZero.add(i);
                colZero.add(j);
            }
        }
    }
        for(int i = 0;i<row;i++) {
            if(rowZero.contains(i)) {
                for(int j=0;j<col;j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for(int j=0;j<col;j++) {
            if(colZero.contains(j)) {
                for(int i = 0;i<row;i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
