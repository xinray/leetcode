package leetcode.sixty60;

/**
 * Created by ray on 7/8/17.
 */
public class Q55JumpGame {
    public class Solution {
        public boolean canJump(int[] nums) {
            if(nums.length < 2) return true;

            for(int i = nums.length-2; i>=0;i--) {
                if(nums[i]  == 0) {
                    int numsteep = 1;
                    while(numsteep > nums[i]) {
                        numsteep++;
                        i--;
                        if(i< 0) return false;
                    }
                }
            }
            return true;
        }
    }
}
