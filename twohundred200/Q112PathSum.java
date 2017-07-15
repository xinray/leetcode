package leetcode.twohundred200;

/**
 * Created by ray on 7/15/17.
 */
public class Q112PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root ==null)return false;
        if(root.left == null && root.right == null && sum - root.val == 0) return true;

        return hasPathSum(root.left,sum -root.val) || hasPathSum(root.right,sum-root.val);
    }
}
