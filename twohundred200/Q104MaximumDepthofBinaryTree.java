package leetcode.twohundred200;

/**
 * Created by ray on 7/15/17.
 */
public class Q104MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
