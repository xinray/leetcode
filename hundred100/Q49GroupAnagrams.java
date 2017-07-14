package leetcode.fifty50;

import java.util.*;

/**
 * Created by ray on 7/8/17.
 */
public class Q49GroupAnagrams {
    public class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            if (strs == null || strs.length == 0) return new ArrayList<List<String>>();
            Map<String, List<String>> map = new HashMap<String, List<String>>();
            int len = strs.length;

            for(String s:strs) {
                char[] ca = s.toCharArray();
                Arrays.sort(ca);
                String ss = String.valueOf(ca);
                if(!map.containsKey(ss)) map.put(ss, new ArrayList<String>());
                map.get(ss).add(s);
            }
            return new ArrayList<List<String>>(map.values());

        }
    }
}
