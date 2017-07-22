package leetcode.twohundred200;

import java.util.Stack;

/**
 * Created by ray on 7/22/17.
 */
public class Q150EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        if(tokens.length == 0) return 0;
        Stack<Integer> st = new Stack();

        for(int i =0;i<tokens.length;i++) {
            String s = tokens[i];
            if(s.equals("+")) {
                st.push(st.pop()+st.pop());
            } else if(s.equals("-")) {
                st.push(st.pop()-st.pop());
            } else if(s.equals("/")) {
                int b = st.pop();
                int a = st.pop();
                if(b == 0) {
                    return 0;
                }
                st.push(a / b);
            } else if(s.equals("*")) {
                st.push(st.pop()*st.pop());
            } else {
                st.push(Integer.parseInt(s));
            }
        }
        return st.peek();

    }
}
