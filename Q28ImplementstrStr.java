package leetcode;

/**
 * Created by ray on 3/28/17.
 */
public class Q28ImplementstrStr {
    public class Solution {
        public int strStr(String haystack, String needle) {
            if(haystack==null || needle == null || needle.length()==0) {
                return 0;
            }
            int haylen = haystack.length();
            int needlen = needle.length();

            if(haylen<needlen) return -1;

            for(int i=0;i<haylen-needlen+1;i++) {
                boolean successFlag = true;
                for(int j=0;j<needle.length();j++)
                {
                    if(haystack.charAt(i+j)!=needle.charAt(j))
                    {
                        successFlag = false;
                        break;
                    }
                }
                if(successFlag)
                    return i;
            }

            return -1;
        }
    }
}
