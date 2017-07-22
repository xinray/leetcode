package leetcode.twohundred200;

/**
 * Created by ray on 7/22/17.
 */
public class Q171ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int result = 0;
        for(int i=0;i<s.length();i++) {
            result = result * 26 + (s.charAt(i) - 'A' + 1);
        }
        return result;
    }
}
