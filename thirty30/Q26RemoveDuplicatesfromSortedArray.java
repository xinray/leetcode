package leetcode.thirty30;

/**
 * Created by ray on 3/28/17.
 */
public class Q26RemoveDuplicatesfromSortedArray {
    public class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length==0) return 0;
            int j=0;
            for (int i=0; i<nums.length; i++)
                if (nums[i]!=nums[j]) nums[++j]=nums[i];
            return ++j;
        }
    }
}
