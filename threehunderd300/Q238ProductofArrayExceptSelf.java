package leetcode.threehunderd300;

/**
 * Created by ray on 9/11/17.
 */
public class Q238ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        for(int i = 0, tmp = 1; i < nums.length; i++) {
            result[i] = tmp;
            tmp *= nums[i];
        }

        for(int i = nums.length-1 , tmp = 1; i>=0; i--) {
            result[i] *=tmp;
            tmp *= nums[i];
        }

        return result;

    }
}
