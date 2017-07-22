package leetcode.twohundred200;

/**
 * Created by ray on 7/22/17.
 */
public class Q162FindPeakElement {
    public int findPeakElement(int[] nums) {
        if(nums.length == 0) return -1;
        if(nums.length == 1) return 0;


        if(nums[0]>nums[1]) return 0;

        if(nums[nums.length-2]<nums[nums.length-1]) return nums.length-1;

        for(int i = 1; i<nums.length-1;i++) {
            if(nums[i-1]<nums[i] && nums[i]>nums[i+1]) {
                return i;
            }
        }
        return -1;
    }
}
