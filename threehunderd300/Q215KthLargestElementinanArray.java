package leetcode.threehunderd300;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by ray on 8/20/17.
 */
public class Q215KthLargestElementinanArray {
    public int findKthLargest(int[] nums, int k) {
        if(nums.length < k){
            return 0;
        }
        Queue<Integer> pq = new PriorityQueue<Integer>(k);
        for(int i = 0; i < nums.length; i++){
            if(i < k){
                pq.add(nums[i]);
            }else{
                if(nums[i] > pq.peek()){
                    pq.poll();
                    pq.add(nums[i]);
                }
            }
        }
        return pq.peek();

    }
}
