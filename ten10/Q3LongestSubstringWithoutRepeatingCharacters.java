package leetcode.ten10;

import java.util.HashMap;

/**
 * Created by ray on 3/27/17.
 */
public class Q3LongestSubstringWithoutRepeatingCharacters {
    public class Solution {
        public int lengthOfLongestSubstring(String s) {
            char[] chs = s.toCharArray();
            HashMap<Character,Integer> has = new HashMap<Character,Integer>();
            int max =0;

            for(int i=0, j=0; i<chs.length;i++) {
                if(has.containsKey(chs[i])) {
                    j = Math.max(j,has.get(s.charAt(i))+1);

                }
                has.put(chs[i],i);
                max = Math.max(max,i-j+1);
            }

            return max;
        }
    }
}
