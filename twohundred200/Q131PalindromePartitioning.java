package leetcode.twohundred200;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ray on 7/19/17.
 */
public class Q131PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> ls = new ArrayList<List<String>>();
        backTrack(ls, new ArrayList<String>(), s, 0);
        return ls;
    }
    public void backTrack(List<List<String>> res, ArrayList<String> path, String s, int pos) {
        if(pos == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i = pos ; i<s.length();i++) {
            String ss = s.substring(pos,i+1);
            String sb = new StringBuffer(ss).reverse().toString();
            if(ss.equals(sb)) {
                path.add(ss);
                backTrack(res,path,s,i+1);
                path.remove(path.size()-1);
            }
        }
    }
}
