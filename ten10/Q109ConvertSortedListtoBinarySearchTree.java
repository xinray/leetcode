package leetcode.ten10;


import leetcode.hundred100.ListNode;

/**
 * Created by ray on 7/15/17.
 */

public class Q109ConvertSortedListtoBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        return constructTree(head,null);
    }
    public TreeNode constructTree(ListNode head, ListNode tail) {
        ListNode fast= head,slow = head;
        if(head==tail) return null;
        while(fast != tail && fast.next !=tail) {
            slow = slow.next;
            fast = fast.next.next;
        }

        TreeNode root = new TreeNode(slow.val);
        root.left = constructTree(head,slow);
        root.right = constructTree(slow.next,tail);
        return root;
    }
}
