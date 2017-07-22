package leetcode.twohundred200;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ray on 7/20/17.
 */
public class Q139WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s.length() ==0 || wordDict.size()==0)
            return true;

        boolean[] res = new boolean[s.length()+1];
        res[0] = true;

        for(int i=0;i<s.length();i++) {
            StringBuilder str = new StringBuilder(s.substring(0,i+1));
            for(int j=0;j<i;j++) {
                if(res[j] && wordDict.contains(str.toString())) {
                    res[i+1] = true;
                    break;
                }

                str.deleteCharAt(0);
            }
        }
        return res[s.length()+1];
    }
}
