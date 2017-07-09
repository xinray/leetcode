package leetcode.ten10;

/**
 * Created by ray on 3/28/17.
 */
public class Q8StringtoInteger {
    public class Solution {
        public int myAtoi(String str) {
            if(str == null || str.length() ==0) return 0;
            str = str.trim();
            char[] chs = str.toCharArray();
            int sign = 1;
            int star = 0;
            long sum=0;

            if(chs[0] == '+' ) {
                sign = 1;
                star++;
            } else if(chs[0] == '-') {
                sign = -1;
                star++;
            }

            for(int i=star;i<chs.length;i++) {
                if(!Character.isDigit(chs[i])) {
                    return (int)sum*sign;
                }
                sum = sum * 10 + str.charAt(i) - '0';
                if (sign == 1 && sum>Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (sign == -1 && (-1)*sum<Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }

            }

            return (int)sum*sign;
        }
    }
}
