package leetcode.hundred100;

/**
 * Created by ray on 7/12/17.
 */
public class Q91DecodeWays {
    public int numDecodings(String s) {
        int n = s.length();

        int[] men = new int[n+1];
        if(s.length() ==0) return 0;
        men[n] = 1;
        men[n-1] = s.charAt(n-1) != '0' ? 1 : 0;


        for(int i=n-2;i>=0;i--) {
            if(s.charAt(i) == '0') continue;
            else {
                men[i] = (Integer.parseInt(s.substring(i,i+2)) <=26)? men[i+1]+men[i+2]:men[i+1];
            }
        }
        return men[0];
    }
}
