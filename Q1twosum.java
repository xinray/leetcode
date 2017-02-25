import java.util.HashMap;

/**
 * Created by ray on 1/3/17.
 */
public class twosum {
    public class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for(int i = 0; i< nums.length; i++) {
                if(map.get(nums[i]) != null) {
                    int[] result = {map.get(nums[i]), i};
                    return result;
                }

                map.put(target-nums[i], i);
            }

            int[] result = {};
            return result;
        }
    }
}
