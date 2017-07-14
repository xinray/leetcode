package leetcode.eighty80;

/**
 * Created by ray on 7/10/17.
 *
 *
 * 这道题没有做出来  可以再做过
 */
public class Q80RemoveDuplicatesfromSortedArrayII {
    public int removeDuplicates(int[] nums) {


        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i - 2])
                nums[i++] = n;
        return i;
    }
}
