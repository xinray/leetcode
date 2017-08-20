package leetcode.threehunderd300;

import java.util.HashMap;

/**
 * Created by ray on 8/20/17.
 */
public class Q217ContainsDuplicateI {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0 ) return false;
        HashMap<Integer,Integer> it = new HashMap<>();

        for (int i =0 ;i<nums.length ;i++) {
            if(it.containsKey(nums[i])) {
                return  true;
            }
            it.put(nums[i],1);

        }
        return false;

    }
}
