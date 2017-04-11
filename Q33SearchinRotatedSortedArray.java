package leetcode;

/**
 * Created by ray on 1/3/17.
 */
public class Q33SearchinRotatedSortedArray {
    public class Solution {
        public int search(int[] nums, int target) {
            if(nums.length == 0) {
                return  -1;
            }
            int begin = 0;
            int end = nums.length-1;

            while(begin<=end) {
                int mid = (begin+end)/2;
                if (nums[mid] == target)
                    return mid;

                if (nums[begin] <= nums[mid]){
                    if (target < nums[mid] && target >= nums[begin])
                        end = mid - 1;
                    else
                        begin = mid + 1;
                }

                if (nums[mid] <= nums[end]){
                    if (target > nums[mid] && target <= nums[end])
                        begin = mid + 1;
                    else
                        end = mid - 1;
                }
            }

            return -1;
        }
    }
}
