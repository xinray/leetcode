package leetcode.seventy70;

/**
 * Created by ray on 7/9/17.
 *
 * 没理解什么意思
 * 
 */
public class Q69SqrtX {
    public int mySqrt(int x) {
        if (x == 0)
            return 0;
        int left = 1, right = Integer.MAX_VALUE;
        while (true) {
            int mid = left + (right - left)/2;
            if (mid > x/mid) {
                right = mid - 1;
            } else {
                if (mid + 1 > x/(mid + 1))
                    return mid;
                left = mid + 1;
            }
        }

    }
}
