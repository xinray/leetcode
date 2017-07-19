package leetcode.twohundred200;

/**
 * Created by ray on 7/19/17.
 */
public class Q129SumRoottoLeafNumbers {
    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        return totalSum(root,0);
    }

    public int totalSum(TreeNode root,int sum) {
        if(root == null) return 0;
        if (root.right == null && root.left == null) return sum*10 + root.val;
        return totalSum(root.left,sum*10 + root.val) + totalSum(root.right,sum*10+ root.val);
    }
}
