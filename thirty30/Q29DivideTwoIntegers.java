package leetcode.thirty30;

/**
 * Created by ray on 3/28/17.
 *
 *
 * 可以再做一遍
 */
public class Q29DivideTwoIntegers {
    public class Solution {
        public int divide(int dividend, int divisor) {
            if(divisor == 0 || dividend == Integer.MIN_VALUE && divisor == -1 ) {
                return Integer.MAX_VALUE;
            }

            int sign = ((dividend < 0) ^ (divisor < 0))?-1:1;

            long divid = Math.abs((long) dividend);
            long divis = Math.abs((long) divisor);

            int result = 0;
            while(divid>=divis) {
                long tmp = divis;

                long mul = 1;

                while(divid >= (tmp<<1)) {
                    mul <<= 1;
                    tmp = tmp<<1;
                }

                divid = divid - tmp;
                result += mul;
            }

            return result*sign;
        }

    }
}
