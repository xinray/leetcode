package leetcode.twohundred200;

/**
 * Created by ray on 7/22/17.
 *
 * 只需 比前一个小就可以退回了
 *
 */
public class Q153FindMinimuminRotatedSortedArray {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int start = 0, end = nums.length - 1;

        while (start < end) {
            int mid = (start+end)/2;

            if(mid>0 && nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            if(nums[start]<=nums[mid] && nums[mid] >nums[end]) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return nums[start];
    }
}
