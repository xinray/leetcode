package leetcode.twohundred200;

/**
 * Created by ray on 7/20/17.
 */
public class Q137SingleNumberII {
    public int singleNumber(int[] nums) {
        int result = 0;

        for(int i : nums) {
            result ^= result;
        }
        return result;
    }
}
