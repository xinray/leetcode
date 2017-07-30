package leetcode.threehunderd300;

/**
 * Created by ray on 7/30/17.
 */
public class Q205IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {

        int[] m = new int[256];
        int[] ss = new int[256];

        for(int i=0;i<s.length();i++) {
            if(m[s.charAt(i)] != ss[t.charAt(i)]) return false;
            m[s.charAt(i)] = i+1;
            ss[t.charAt(i)] = i+1;
        }
        return true;
    }
}
