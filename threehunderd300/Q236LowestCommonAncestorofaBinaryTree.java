package leetcode.threehunderd300;

/**
 * Created by ray on 9/11/17.
 */
public class Q236LowestCommonAncestorofaBinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == q || root == p ) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p , q);
        if (left != null && right != null) return root;
        return (left != null) ? left : right;
    }
}
