package leetcode.threehunderd300;

import java.util.HashMap;

/**
 * Created by ray on 8/20/17.
 */
public class Q217ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length == 0 ) return false;
        HashMap<Integer,Integer> it = new HashMap<>();

        int d = 0;
        int differ = 0;
        for (int i =0 ;i<nums.length ;i++) {
            if(it.containsKey(nums[i])) {
                int beg = it.get(nums[i]);
                differ = i-beg;
                d++;
            } else {
                it.put(nums[i],i);

            }

        }
        if(d == 0 && differ<=k) return true;
        return false;
    }
}
