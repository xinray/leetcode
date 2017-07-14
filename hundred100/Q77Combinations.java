import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanxinrui on 2017/7/10.
 */
public class Q77Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combs = new ArrayList<List<Integer>>();
        combine(combs, new ArrayList<Integer>(), 1, n, k);
        return combs;
    }

    public void combine(List<List<Integer>> combs,List<Integer> ne, int start,int n,int k) {
        if(k == 0) {
            combs.add(new ArrayList<Integer>(ne));
            return;
        }
        for(int i=start;i<=n;i++) {
            ne.add(i);
            combine(combs, ne, i+1, n, k-1);
            ne.remove(ne.size()-1);
        }
    }
}
