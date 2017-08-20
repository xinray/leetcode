package leetcode.threehunderd300;

/**
 * Created by ray on 7/30/17.
 */
public class Q201BitwiseANDofNumbersRange {
    public int rangeBitwiseAnd(int m, int n) {

        int d = Integer.MAX_VALUE;
        while ((m & d) != (n & d)) {
            d <<= 1;
        }
        return m & d;
    }
}
