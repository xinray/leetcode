package leetcode;

/**
 * Created by ray on 7/8/17.
 * 
 * 
 * 
 * 难点在于考虑 变换符号的时候 容易超出最小值的下界,需要考虑 单独处理
 */
public class Q50PowXN {
    public class Solution {
        public double myPow(double x, int n) {
            if(n == 0) return 1;
            if(n == Integer.MIN_VALUE){
                x = x * x;
                n = n/2;
            }
            if(n < 0 ) {
                n = -n;
                x = 1/x;
            }
            return (n%2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
        }
    }
}
