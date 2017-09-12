package leetcode.threehunderd300;

/**
 * Created by ray on 9/11/17.
 */
public class Q237DeleteNodeinaLinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
