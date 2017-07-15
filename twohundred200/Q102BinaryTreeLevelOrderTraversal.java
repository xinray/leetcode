package leetcode.twohundred200;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by ray on 7/14/17.
 */
public class Q102BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();

        if(root == null) return wrapList;

        queue.add(root);
        while(!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> li = new LinkedList<>();
            for(int i = 0;i<levelNum;i++) {
                if(queue.peek().left!=null) queue.add(queue.peek().left);
                if(queue.peek().right!=null) queue.add(queue.peek().right);
                li.add(queue.poll().val);
            }
            wrapList.add(li);

        }
        return wrapList;
    }
}
