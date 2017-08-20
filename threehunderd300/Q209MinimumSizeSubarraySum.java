package leetcode.threehunderd300;

/**
 * Created by ray on 8/20/17.
 */
public class Q209MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {

        if(nums.length == 0) return 0;

        int count = Integer.MAX_VALUE;

        int begin =0, sum =0;
        for(int i=0;i<nums.length;i++) {
            sum += nums[i++];

            while(sum >= s) {
                count = Math.min(count, i-begin);
                sum -= nums[begin++];
            }

        }
        return count == Integer.MAX_VALUE ? 0 : count;
    }
}
