package leetcode.ninety90;

/**
 * Created by ray on 7/11/17.
 *
 *
 * 这道题每做对,链表的关系都弄错了。
 */
public class Q82RemoveDuplicatesfromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode li = new ListNode(0);
        li.next = head;
        ListNode cur = head;
        ListNode pre = li;

        while(cur!=null) {
            if(cur.next == null) break;
            while(cur.next.val ==cur.val) {
                cur = cur.next;
            }
            if(pre.next == cur) {
                pre = pre.next;
            } else {
                pre.next = cur.next;
            }
            cur = cur.next;
        }

        return li.next;
    }
}
