package leetcode.twenty20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ray on 1/3/17.
 */
public class Q16threeSumClosest {
    public class Solution {
        public int threeSumClosest(int[] nums, int target) {
            if (nums == null || nums.length < 3) return 0;
            int closetNum = nums[0] + nums[1] + nums[nums.length-1];

            Arrays.sort(nums);

            for(int i = 0 ; i< nums.length-2; i++) {
                int left =  i + 1;
                int right = nums.length - 1;

                while(left < right) {
                    int sum =  nums[i] + nums[left] + nums[right];
                    if (sum > target) {
                        right--;
                    } else {
                        left++;
                    }
                    if (Math.abs(sum - target) < Math.abs(closetNum - target)) {
                        closetNum = sum;
                    }

                }
            }
            return closetNum;
        }
    }
}
