package leetcode.threehunderd300;

/**
 * Created by ray on 8/25/17.
 */
public class Q226InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;

        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);

        return root;

    }
}
