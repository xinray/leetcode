package leetcode.twohundred200;

import java.util.HashMap;

/**
 * Created by ray on 7/22/17.
 */
public class Q166FractiontoRecurringDecimal {
    public String fractionToDecimal(int numerator, int denominator) {
        if(denominator == 0) return "";
        StringBuilder result = new StringBuilder();
        String sign = (numerator < 0 == denominator < 0 || numerator == 0) ? "" : "-";
        HashMap<Long,Integer> hash = new HashMap();
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);
        result.append(sign);
        result.append(num/den);
        long remainder = num % den;
        if (remainder == 0)
            return result.toString();

        result.append(".");
        while (!hash.containsKey(remainder)) {
            hash.put(remainder,result.length());
            result.append(10 * remainder / den);
            remainder = 10 * remainder % den;
        }

        int index = hash.get(remainder);
        result.insert(index, "(");
        result.append(")");
        return result.toString().replace("(0)", "");
    }
}
