package leetcode.hundred100;

/**
 * Created by ray on 7/14/17.
 */
public class Q100SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val == q.val) return isSameTree(p.left,q.left) && isSameTree(q.right,p.right);


        return false;
    }


}
