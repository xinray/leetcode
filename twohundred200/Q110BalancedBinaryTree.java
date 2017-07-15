package leetcode.twohundred200;

/**
 * Created by ray on 7/15/17.
 */
public class Q110BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return depth(root) != -1;
    }

    public int depth(TreeNode root) {
        if(root == null) return 0;

        int ld = depth(root.left);
        if(ld == -1) {
            return -1;
        }
        int rd = depth(root.right);
        if(rd == -1) return -1;

        if(Math.abs(ld-rd) >1){
            return -1;
        }

        return 1+Math.max(depth(root.left),depth(root.right));
    }


//    public boolean isBalanced(TreeNode root) {
//        if(root == null) return true;
//        int left = depth(root.left);
//        int right = depth(root.right);
//        return Math.abs(left-right)<=1 && isBalanced(root.right) && isBalanced(root.left);
//    }
//
//    public int depth(TreeNode root) {
//        if(root == null) return 0;
//
//        return 1+Math.max(depth(root.left),depth(root.right));
//    }
}
