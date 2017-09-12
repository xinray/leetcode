package leetcode.fourhunderd400;

/**
 * Created by ray on 9/12/17.
 */
public class Q342PowerofFour {
    public boolean isPowerOfFour(int num) {

        return (num > 0) && ((num & (num - 1)) == 0) && ((num & 0x55555555) == num);
    }
}
