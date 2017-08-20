package leetcode.threehunderd300;

/**
 * Created by ray on 8/20/17.
 */
public class Q222CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int leftDepth = leftDepth(root);
        int rightDepth = rightDepth(root);

        if(leftDepth == rightDepth) {
            return (1 << leftDepth) - 1;
        } else {
            return countNodes(root.left) +countNodes(root.right) +1;
        }

    }

    private int rightDepth(TreeNode root) {
        int dep = 0;
        while (root != null) {
            root = root.right;
            dep++;
        }
        return dep;
    }

    private int leftDepth(TreeNode root) {
        int dep = 0;
        while (root != null) {
            root = root.left;
            dep++;
        }
        return dep;
    }
}
