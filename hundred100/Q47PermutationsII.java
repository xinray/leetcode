package leetcode.fifty50;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by ray on 7/8/17.
 *
 *
 * 相对于46题添加 set hashset 判断是否存在
 */
public class Q47PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (nums.length ==0) return ans;
        List<Integer> l0 = new ArrayList<Integer>();
        l0.add(nums[0]);
        ans.add(l0);
        for (int i = 1; i< nums.length; ++i){
            Set<String> cache = new HashSet<>();
            List<List<Integer>> new_ans = new ArrayList<List<Integer>>();
            for (int j = 0; j<=i; ++j){
                for (List<Integer> l : ans){
                    List<Integer> new_l = new ArrayList<Integer>(l);
                    new_l.add(j,nums[i]);
                    if (cache.add(new_l.toString())) new_ans.add(new_l);
                }
            }
            ans = new_ans;
        }
        return ans;

    }
}
