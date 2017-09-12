package leetcode.threehunderd300;

import java.util.Stack;

/**
 * Created by ray on 9/11/17.
 */
public class Q232ImplementQueueusingStacks {
    class MyQueue {
        Stack<Integer> input = new Stack<>();
        Stack<Integer> output = new Stack<>();

        /** Initialize your data structure here. */
        public MyQueue() {

        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            input.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            peek();
            return output.pop();
        }

        /** Get the front element. */
        public int peek() {
            if(output.isEmpty()) {
                while(!input.isEmpty()) {
                    output.push(input.pop());
                }
            }
            return output.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return input.isEmpty() && output.isEmpty();
        }
    }
}
