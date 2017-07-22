package leetcode.twohundred200;

/**
 * Created by ray on 7/22/17.
 *
 *
 * 考虑不周,没想到情况不可穷举,没考虑到负负得正
 *
 */
public class Q152MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = nums[0], min = nums[0], result = nums[0];
        for(int i=1;i<nums.length;i++) {
            int temp = max;
            max = Math.max(Math.max(max*nums[i],min*nums[i]),nums[i]);
            min = Math.min(Math.min(temp*nums[i],min*nums[i]),nums[i]);
            if(result<max) result=max;
        }
        return result;
    }
}
