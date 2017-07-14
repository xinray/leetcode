package leetcode.ten10;

/**
 * Created by ray on 3/27/17.
 */
public class Q5LongestPalindromicSubstring {


    public class Solution {
        private int begin=0 ,maxlen=0;
        public String longestPalindrome(String s) {
            int len = s.length();

            if(len < 2) return s;

            for(int i=0;i<len;i++){
                findPalindrome(s,i,i);
                findPalindrome(s,i,i+1);
            }

            return s.substring(begin,begin+maxlen);

        }

        private void findPalindrome(String s , int i, int j) {
            while(i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
            }
            if(maxlen <j-i-1) {
                begin = i+1;
                maxlen = j-i-1;
            }
        }
    }

}
