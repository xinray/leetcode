package leetcode.twohundred200;

/**
 * Created by ray on 7/16/17.
 */

class TreeLinkNode {
    int val;
    TreeLinkNode left, right, next;
    TreeLinkNode(int x) { val = x; }
}

public class Q116PopulatingNextRightPointersinEachNode {
    public void connect(TreeLinkNode root) {
        if(root == null) return;

        if(root.left != null) {
            root.left.next= root.right;
            if(root.next!=null) {
                root.right.next = root.next.left;
            }
        }
        connect(root.left);
        connect(root.right);
    }
}
