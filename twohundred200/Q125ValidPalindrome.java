package leetcode.twohundred200;

/**
 * Created by ray on 7/19/17.
 */
public class Q125ValidPalindrome {
    public boolean isPalindrome(String s) {
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reverse = new StringBuffer(actual).reverse().toString();
        return actual.equals(reverse);
    }
}
