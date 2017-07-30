package leetcode.threehunderd300;

/**
 * Created by ray on 7/30/17.
 */
public class Q203RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr = head;
        ListNode fastNode = new ListNode(0);
        fastNode.next = head;
        ListNode prev = fastNode;

        while(curr != null) {
            if(curr.val == val) {
                prev.next = curr.next;
                curr = prev.next;

            } else {
                prev = prev.next;
                curr = curr.next;
            }
        }
        return fastNode.next;
    }
}
