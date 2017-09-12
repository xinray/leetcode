package leetcode.threehunderd300;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by ray on 9/12/17.
 */
public class Q290WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] ss = str.split(" ");
        if(ss.length != pattern.length()) return false;

        Map mp = new HashMap<>();

        for (int i=0; i<ss.length; i++) {

            if (!Objects.equals(mp.put(pattern.charAt(i), i),
                    mp.put(ss[i], i)))
                return false;
        }
        return true;
    }
}
