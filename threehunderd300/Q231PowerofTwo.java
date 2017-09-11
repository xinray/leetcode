package leetcode.threehunderd300;

/**
 * Created by ray on 9/11/17.
 */
public class Q231PowerofTwo {
    public boolean isPowerOfTwo(int n) {
        int count = 1;

        while (n > 0) {
            count += (n&1);
            n>>=1;

        }
        return count == 1;
    }
}
