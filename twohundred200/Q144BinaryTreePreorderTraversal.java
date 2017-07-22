package leetcode.twohundred200;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ray on 7/20/17.
 */
public class Q144BinaryTreePreorderTraversal {
    List<Integer> li = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return li;
        li.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return li;
    }
}
