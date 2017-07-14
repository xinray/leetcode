package leetcode.sixty60;

/**
 * Created by ray on 7/8/17.
 */
public class Q58LengthofLastWord {
    public class Solution {
        public int lengthOfLastWord(String s) {
            int num = 0;
            char[] ch = s.trim().toCharArray();

            int len = ch.length;
            for(int j = len-1;j>=0;j--) {
                if(ch[j] == ' ') {
                    return num;
                }
                num++;
            }
            return num;
        }
    }
}
