package leetcode.threehunderd300;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ray on 9/11/17.
 */
public class Q241DifferentWaystoAddParentheses {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> result = new LinkedList<>();

        for(int i=0;i<input.length();i++) {
            if(input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*') {
                String forward = input.substring(0,i);
                String backword = input.substring(i+1);
                List<Integer> forresult = diffWaysToCompute(forward);
                List<Integer> backresult = diffWaysToCompute(backword);
                for (int fo :forresult) {
                    for (int back : backresult) {
                        int c = 0;
                        switch (input.charAt(i)) {
                            case '+':
                                c = fo + back;
                                break;
                            case '-':
                                c = fo - back;
                                break;
                            case '*':
                                c = fo * back;
                                break;
                        }
                        result.add(c);
                    }

                }
            }
        }
        if (result.size() == 0) {
            result.add(Integer.valueOf(input));
        }
        return result;

    }
}
