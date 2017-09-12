package leetcode.threehunderd300;

/**
 * Created by ray on 9/12/17.
 */
public class Q260SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        int diff = 0;
        for (int n : nums) {
            diff ^=n;
        }
        diff &= -diff;

        int[] result =  {0,0};

        for (int n : nums) {
            if ((n & diff) == 0) {
                result[0] ^= n;
            } else if ((n & diff) != 0) {
                result[1] ^= n;
            }
        }

        return result;
    }
}
