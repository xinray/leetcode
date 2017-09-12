package leetcode.fourhunderd400;

/**
 * Created by ray on 9/12/17.
 */
public class Q326PowerofThree {
    public boolean isPowerOfThree(int n) {

        return n > 0 && (1162261467 % n == 0);
    }
}
