package leetcode.ten10;

/**
 * Created by ray on 7/15/17.
 */
public class Q108ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return  null;

        return construtTree(0,nums.length-1,nums);
    }
    public TreeNode construtTree(int low, int high, int[] nums) {
        if(low>high) return null;
        int mid = (low + high)/2;
        TreeNode tr = new TreeNode(nums[mid]);
        tr.left = construtTree(low,mid-1,nums);
        tr.right = construtTree(mid+1,high,nums);
        return tr;
    }
}
