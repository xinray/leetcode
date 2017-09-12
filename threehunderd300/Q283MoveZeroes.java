package leetcode.threehunderd300;

/**
 * Created by ray on 9/12/17.
 */
public class Q283MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums.length == 0) return;

        int end = 0;
        for (int i=0; i<nums.length; i++) {

            if(nums[i] == 0) {
                for (int j = i; j < nums.length; j++) {
                    if(nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }
        }
    }
}
