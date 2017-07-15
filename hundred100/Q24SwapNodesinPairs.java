package leetcode.hundred100;


/**
 * Created by ray on 3/27/17.
 */
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
