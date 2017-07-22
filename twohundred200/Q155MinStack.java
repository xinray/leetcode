package leetcode.twohundred200;

import java.util.Stack;

/**
 * Created by ray on 7/22/17.
 */
public class Q155MinStack {

    public class MinStack {
        Stack<Integer> st = new Stack();
        int min = Integer.MAX_VALUE;

        /** initialize your data structure here. */
        public MinStack() {
            st=new Stack<>();
        }

        public void push(int x) {
            if(x<=min) {
                st.push(min);
                min = x;
            }
            st.push(x);
        }

        public void pop() {
            int x = st.pop();
            if(min == x) {
                min = st.pop();
            }
        }

        public int top() {
            return st.peek();
        }

        public int getMin() {
            return min;
        }
    }
}
