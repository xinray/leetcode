package leetcode.threehunderd300;

/**
 * Created by ray on 9/11/17.
 */
public class Q235LowestCommonAncestorofaBinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val < Math.min(p.val,q.val)) return lowestCommonAncestor(root.right, p, q);
        if(root.val > Math.max(p.val, q.val)) return lowestCommonAncestor(root.left, p, q);
        return root;
    }
}
