package leetcode.threehunderd300;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ray on 9/12/17.
 */
public class Q264UglyNumberII {
    public int nthUglyNumber(int n) {
        if(n<=0) return 0;

        List<Integer> result = new ArrayList<>();
        int count2 = 0, count3 = 0 , count5 =0;
        result.add(1);
        while (result.size() <n) {
            int ugly = Math.min(result.get(count2)*2, Math.min(result.get(count3)*3, result.get(count5)*5));

            result.add(ugly);

            if(result.get(count2)*2 == ugly) {
                count2++;
            }
            if(result.get(count3)*3 == ugly) {
                count3++;
            }
            if(result.get(count5)*5 == ugly) {
                count5++;
            }
        }
        return result.get(result.size()-1);
    }
}
