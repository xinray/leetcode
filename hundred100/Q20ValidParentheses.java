package leetcode.twenty20;

import java.util.Stack;

/**
 * Created by ray on 3/27/17.
 */
public class Q20ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();

        for(char c: s.toCharArray()) {
            if(c == '(') {
                st.push(')');
            } else if(c == '{') {
                st.push('}');
            } else if (c == '[') {
                st.push(']');
            } else if (st.isEmpty() || st.pop() != c) {
                return false;
            }
        }
        return st.isEmpty();
    }
}
