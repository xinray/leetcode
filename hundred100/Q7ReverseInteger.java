package leetcode.ten10;

import java.util.Stack;

/**
 * Created by ray on 3/27/17.
 */
public class Q7ReverseInteger {
    public class Solution {
        public int reverse(int x) {

            int result=0;

            while(x!= 0) {
                int tail = x % 10;
                int newResult = result * 10 + tail;
                if ((newResult - tail) / 10 != result)
                { return 0; }
                result = newResult;
                x=x/10;
            }
            return result;
        }
    }
}
