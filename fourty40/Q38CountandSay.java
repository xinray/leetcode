package leetcode.fourty40;

/**
 * Created by ray on 4/12/17.
 */
public class Q38CountandSay {
    public class Solution {
        public String countAndSay(int n) {
            String result = "1";
            int i = 1;
            while(i<n) {
                result = countAndSayForOneString(result);
                i++;
            }
            return result;
        }

        public String countAndSayForOneString(String ss) {
            StringBuffer result = new StringBuffer();
            char tmp = ss.charAt(0);
            int  num = 1;
            for(int i=1;i<ss.length();i++) {
                if(tmp == ss.charAt(i)) {
                    num++;
                } else {
                    result = result.append(Integer.toString(num) + tmp);
                    tmp = ss.charAt(i);
                    num=1;
                }
            }
            result = result.append(Integer.toString(num) + tmp);
            return  result.toString();
        }
    }
}
