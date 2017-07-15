package leetcode.twohundred200;

/**
 * Created by ray on 7/15/17.
 */
public class Q114FlattenBinaryTreetoLinkedList {
    private TreeNode prev = null;
    public void flatten(TreeNode root) {
        if(root == null) return;
        TreeNode right = root.right;
        root.right = root.left;
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
}
