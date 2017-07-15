package leetcode.twohundred200;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by ray on 7/14/17.
 */
public class Q103BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Stack<TreeNode> st1 = new Stack<TreeNode>();
        Stack<TreeNode> st2 = new Stack<TreeNode>();

        TreeNode c = root;
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();

        if(root == null) return wrapList;

        st1.push(root);
        while(!st1.isEmpty() || !st2.isEmpty()) {
            List<Integer> tmp=new LinkedList<Integer>();
            while(!st1.isEmpty()) {
                c = st1.pop();
                tmp.add(c.val);
                if(c.left!=null) st2.push(c.left);
                if(c.right!=null) st2.push(c.right);
            }
            wrapList.add(tmp);
            tmp = new LinkedList<>();
            while(!st2.isEmpty()) {
                c = st2.pop();
                tmp.add(c.val);
                if(c.right!=null) st1.push(c.right);
                if(c.left!=null) st1.push(c.left);
            }
            if(!tmp.isEmpty()) wrapList.add(tmp);

        }

        return wrapList;

    }
}
