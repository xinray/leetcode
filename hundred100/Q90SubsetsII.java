package leetcode.ninety90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by ray on 7/12/17.
 */
public class Q90SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> li = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        List<Integer> each = new ArrayList<>();
        Subsets(li,each,nums,0);
        return li;
    }

    public void  Subsets(List<List<Integer>> res, List<Integer> li,int[] nums, int start) {
        if(start <= nums.length){
            res.add(li);
        }
        int i = start;
        while(i<nums.length) {
            li.add(nums[i]);
            Subsets(res,new ArrayList<>(li),nums,i+1);
            li.remove(li.size() - 1);
            i++;
            while(i<nums.length && nums[i] == nums[i-1]) {
                i++;
            }

        }
        return;
    }
}
