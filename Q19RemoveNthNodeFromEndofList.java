package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ray on 1/3/17.
 */
public class Q19RemoveNthNodeFromEndofList {
    public class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode slowNode = head;
            ListNode quickNode = head;

            while(n-->0){
                quickNode = quickNode.next;
            }
            if(quickNode==null)return head.next;
            quickNode=quickNode.next;

            while(quickNode!=null) {
                slowNode=slowNode.next;
                quickNode=quickNode.next;
            }
            slowNode.next=slowNode.next.next;
            return head;
        }
    }
}
