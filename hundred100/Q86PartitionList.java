package leetcode.ninety90;

/**
 * Created by ray on 7/11/17.
 */
public class Q86PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0),dummy2 = new ListNode(0);
        ListNode small = dummy1,big = dummy2;
        while(head!=null) {
            if(head.val >= x) {
                big.next = head;
                big = head;
            } else {
                small.next = head;
                small = head;
            }
            head = head.next;
        }
        big.next = null;
        small.next = dummy2.next;
        return dummy1.next;
    }
}
