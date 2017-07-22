package leetcode.twohundred200;

/**
 * Created by ray on 7/22/17.
 */
public class Q168ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        String res = "";
        while(n!=0) {
            char ch = (char)(n%26 +56);
            n=n/26;
            res = res+ch;
        }
        return res;
    }
}
