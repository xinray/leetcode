package leetcode.twohundred200;

/**
 * Created by ray on 7/20/17.
 */
public class Q147InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if(head ==null ) return head;
        ListNode help = new ListNode(0);
        ListNode cur = head;
        ListNode pre = help;
        ListNode next = null;

        while(cur!=null) {
            next = cur.next;
            while(pre.next!=null && pre.next.val <cur.val) {
                pre = pre.next;
            }
            cur.next = pre.next;
            pre.next = cur;
            pre = help;
            cur = next;
        }
        return help.next;
    }
}
