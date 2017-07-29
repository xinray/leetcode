package leetcode.twohundred200;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by ray on 7/24/17.
 */
public class Q179LargestNumber {
    public String largestNumber(int[] nums) {
        int n= nums.length;
        if(n==0) return "";
         String[] ss = new String[n];
        for(int i=0;i<n;i++) {
            ss[i] = String.valueOf(nums[i]);
        }

        Comparator<String> tmp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String l1 = o1+o2;
                String l2 = o2+o1;
                return l2.compareTo(l1);
            }
        };

        Arrays.sort(ss,tmp);
        if(ss[0].charAt(0) == '0')
            return "0";

        StringBuilder sb = new StringBuilder();
        for(String s: ss)
            sb.append(s);

        return sb.toString();

    }
}
