package leetcode.threehunderd300;

/**
 * Created by ray on 9/11/17.
 */
public class Q234PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if(fast != null ) {
            slow = slow.next;
        }

        slow = reverse(slow);
        fast = head;

        while(slow != null ) {
            if(fast.val != slow.val ) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return  true;

    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;

            prev = head;
            head = temp;

        }
        return prev;
    }


}
