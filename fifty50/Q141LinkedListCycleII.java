package leetcode;

/**
 * Created by ray on 3/26/17.
 */


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}


class linkedlistcycle {
    public boolean hasCycle(ListNode head) {

        if(head==null) return false;

        ListNode first = head;
        ListNode second = head;

        while (second.next != null  && second.next.next != null ) {
            first = first.next;
            second = second.next.next;

            if(first == second) {
                return true;
            }
        }

        return false;
    }
}
