package leetcode.threehunderd300;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ray on 9/12/17.
 */
public class Q242ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] count = new int[256];

        for(int i=0; i<s.length(); i++) count[s.charAt(i) - 'a']++;
        for(int i=0; i<t.length(); i++) count[t.charAt(i) - 'a']--;

        for(int i=0; i<count.length; i++) {
            if(count[i] != 0 ) {
                return false;
            }
        }
        return true;
    }
}
