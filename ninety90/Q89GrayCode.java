package leetcode.ninety90;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ray on 7/11/17.
 */
public class Q89GrayCode {
    public List<Integer> grayCode(int n) {
        if(n < 0) {
            return new ArrayList<Integer>();
        }
        if(n == 0) {
            List list = new ArrayList();
            list.add(0);
            return  list;
        }
        List<Integer> tmp = grayCode(n-1);
        List<Integer> result = new ArrayList<>(tmp);
        int newnum = 1 <<(n-1);

        for(int i = tmp.size()-1; i>=0;i--) {
            result.add(newnum + tmp.get(i));
        }
        return result;
    }
}
