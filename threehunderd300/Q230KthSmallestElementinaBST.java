package leetcode.threehunderd300;

/**
 * Created by ray on 9/11/17.
 */
public class Q230KthSmallestElementinaBST {
    int result = Integer.MIN_VALUE;
    int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        midOrderTraverse(root,k);
        return result;
    }

    public void midOrderTraverse(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        midOrderTraverse(root.left, k);
        count++;
        if(count == k ) {
            result = root.val;
        }
        midOrderTraverse(root.right, k);

    }
}
