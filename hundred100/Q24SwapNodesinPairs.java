package leetcode.thirty30;


/**
 * Created by ray on 3/27/17.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class Q24SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode ll = head;
        ListNode temp = head;

        ll = head.next;
        temp = head.next.next;
        head.next = swapPairs(temp);
        ll.next =head;

        return ll;
    }
}
