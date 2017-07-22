package leetcode.twohundred200;

/**
 * Created by ray on 7/20/17.
 */
public class Q143ReorderList {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

        ListNode fast = head;
        ListNode slow = head;

        while(fast.next !=null && fast.next.next!=null){
            slow= slow.next;
            fast= fast.next.next;
        }

        ListNode preMiddle=slow;
        ListNode preCurrent=slow.next;
        while(preCurrent.next!=null) {
            ListNode current = preCurrent.next;
            preCurrent.next = current.next;
            current.next = preMiddle.next;
            preMiddle.next = current;
        }

        slow=head;
        fast=preMiddle.next;
        while(slow!=preMiddle) {
            preMiddle.next = fast.next;
            fast.next = slow.next;
            slow.next = fast;
            slow = fast.next;
            fast = preMiddle.next;
        }

    }
}
