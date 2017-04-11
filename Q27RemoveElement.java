package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ray on 3/28/17.
 */
public class Q27RemoveElement {
    public class Solution {
        public int removeElement(int[] nums, int val) {

            int j=0;
            for(int i=0;i<nums.length;i++) {
                if(nums[i]!=val) nums[j++] = nums[i];
            }
            return j;
        }
    }
}
