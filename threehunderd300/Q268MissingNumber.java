package leetcode.threehunderd300;

/**
 * Created by ray on 9/12/17.
 */
public class Q268MissingNumber {
    public int missingNumber(int[] nums) {

        int sum = 0;
        for(int num: nums)
            sum += num;

        return (nums.length * (nums.length + 1) )/ 2 - sum;

    }
}
