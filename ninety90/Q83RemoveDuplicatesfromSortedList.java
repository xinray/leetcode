package leetcode.ninety90;

/**
 * Created by ray on 7/10/17.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class Q83RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode li = head;
        while(li!=null) {
            if(li.next!=null){
                break;
            }
            if(li.val == li.next.val) {
                li.next = li.next.next;
            } else {
                li = li.next;
            }
        }
        return  head;
    }
}
