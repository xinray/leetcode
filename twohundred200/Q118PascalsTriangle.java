package leetcode.twohundred200;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ray on 7/15/17.
 */
public class Q118PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> allrows = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();

        for (int i=0;i<numRows;i++) {
            row.add(0,1);
            for(int j=1;j<row.size()-1;j++) {
                row.set(j, row.get(j)+row.get(j+1));
                allrows.add(new ArrayList<Integer>(row));
            }
        }
        return allrows;
    }
}
