package leetcode.threehunderd300;

/**
 * Created by ray on 7/30/17.
 */

public class Q206ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        // method 1
//        ListNode prev = null;
//        ListNode ne = head;
//        while(ne!= null) {
//            ListNode nextNode = ne.next;
//            ne.next = prev;
//            prev = ne;
//            ne = nextNode;
//
//        }
//        return prev;


        // method 2

        if(head == null || head.next == null) return head;
        ListNode li = reverseList(head.next);

        head.next.next = head;
        head.next = null;
        return li;
    }
}
