package leetcode.threehunderd300;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ray on 8/20/17.
 */
public class Q216CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> ans = new ArrayList<>();
        combination(ans, new ArrayList<Integer>(), k, 1, n);
        return ans;
    }


    public void combination(List<List<Integer>> as, ArrayList<Integer> li, int k , int begin, int n){

        if(li.size() == k && n ==0) {
            List<Integer> lli = new ArrayList<Integer>(li);
            as.add(lli);
            return;
        }

        for (int i = begin ; i<=9;i++) {
            li.add(i);
            combination(as, li,k, i+1, n-i);
            li.remove(li.size()-1);
        }
    }
}
