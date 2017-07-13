package leetcode.hundred100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ray on 7/14/17.
 */
public class Q98ValidateBinarySearchTree {
    ///法一

//    public boolean isValidBST(TreeNode root) {
//        if(root == null) return true;
//        List<Integer> ll = new ArrayList();
//
//        leftTravas(root , ll);
//        for (int i=1; i<ll.size();i++) {
//            if(ll.get(i)<=ll.get(i-1)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public void leftTravas(TreeNode root, List li) {
//        if(root != null) {
//            leftTravas(root.left,li);
//            li.add(root.val);
//            leftTravas(root.right,li);
//        }
//    }


    //法二
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        if(root == null) return true;
        if(root.val >= maxVal || root.val<= minVal) return false;
        return isValidBST(root.left,minVal,root.val) && isValidBST(root.right,root.val,maxVal);
    }
}
