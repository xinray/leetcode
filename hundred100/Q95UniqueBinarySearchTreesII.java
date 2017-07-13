package leetcode.hundred100;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ray on 7/13/17.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Q95UniqueBinarySearchTreesII {
    public List<TreeNode> generateTrees(int n) {

        if(n==0) return new ArrayList<>();
        return genTreeNode(1,n);
    }

    public List<TreeNode> genTreeNode(int start,int end) {
        List<TreeNode> li = new ArrayList<>();

        if(start>end) {
            li.add(null);
            return li;
        }
        if(start == end) {
            li.add(new TreeNode(start));
            return li;
        }

        List<TreeNode> left,right;

        for(int i=start;i<=end;i++) {
            left = genTreeNode(start ,i-1);
            right = genTreeNode(i+1,end);

            for(TreeNode letn : left) {
                for(TreeNode rightn : right) {
                    TreeNode root = new TreeNode(i);
                    root.left = letn;
                    root.right = rightn;
                    li.add(root);
                }
            }
        }
        return li;
    }
}
