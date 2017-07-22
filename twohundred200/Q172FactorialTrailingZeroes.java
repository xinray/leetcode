package leetcode.twohundred200;

/**
 * Created by ray on 7/22/17.
 */
public class Q172FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int r = 0;
        while (n > 0) {
            n /= 5;
            r += n;
        }
        return r;
    }
}
