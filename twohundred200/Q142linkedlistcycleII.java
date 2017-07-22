package leetcode.twohundred200;

/**
 * Created by ray on 3/26/17.
 */
class Q2AddTwoNumbers {
    public ListNode detectCycle(ListNode head) {

        if(head==null) return null;

        ListNode first = head;
        ListNode second = head;

        while (second.next != null  && second.next.next != null ) {
            first = first.next;
            second = second.next.next;

            if(first == second) {
                while(head != first) {
                    head = head.next;
                    first = first.next;
                }
                return first;
            }
        }

        return null;
    }
}

