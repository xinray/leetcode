package leetcode.hundred100;

/**
 * Created by ray on 7/12/17.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class Q92ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null) return null;

        ListNode l1 = new ListNode(0);
        l1.next = head;
        ListNode l2  =l1;

        for(int i=0;i<m-1;i++) l2 = l2.next;

        ListNode start = l2.next;
        ListNode end = start.next;

        for(int i=0;i<n-m;i++) {
            start.next = end.next;
            end.next = l2.next;
            l2.next = end;
            end = start.next;
        }

        return l1.next;
    }
}
