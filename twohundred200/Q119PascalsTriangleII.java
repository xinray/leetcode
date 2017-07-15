package leetcode.twohundred200;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ray on 7/15/17.
 */
public class Q119PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        if(rowIndex<0) return list;

        for(int i=0;i<rowIndex+1;i++) {
            list.add(0,1);
            for(int j=1;j<list.size()-1;j++) {
                list.set(j, list.get(j) + list.get(j + 1));
            }
        }
        return list;
    }
}
