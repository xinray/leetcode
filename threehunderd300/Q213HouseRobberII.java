package leetcode.threehunderd300;

/**
 * Created by ray on 8/20/17.
 */
public class Q213HouseRobberII {
    public int rob(int[] nums) {
        if(nums.length ==1) return nums[0];
        return Math.max(rob(nums, 0, nums.length-2),rob(nums, 1, nums.length-1));
    }

    public int rob(int[] nums, int start, int end) {

        int preRob = 0, preNotRob = 0, rob = 0, notRob = 0;;

        for(int i=end; i>=start ; i-- ) {
            rob = nums[i] + preNotRob;

            notRob = Math.max(rob, preRob);

            preNotRob = notRob;
            preRob = rob;


        }
        return Math.max(rob, notRob);

    }
}
