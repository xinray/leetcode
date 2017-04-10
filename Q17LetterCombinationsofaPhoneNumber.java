 package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ray on 1/3/17.
 */
public class Q17LetterCombinationsofaPhoneNumber {
    public class Solution {
        public List<String> letterCombinations(String digits) {
            LinkedList<String> result = new LinkedList<String>();
            String[] dict = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
            if (digits.length()==0){
                return result;
            }

            result.add("");
            for(int i=0;i<digits.length();i++) {
                int num = Character.getNumericValue(digits.charAt(i));
                while(result.peek().length()==i) {
                    String t = result.remove();
                    for(char s : dict[num].toCharArray())
                        result.add(t+s);
                }
            }
            return result;
        }
    }
}
