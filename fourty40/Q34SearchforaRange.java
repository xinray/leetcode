package leetcode.fourty40;

/**
 * Created by ray on 1/3/17.
 */
public class Q34SearchforaRange {
    public class Solution {
        public int[] searchRange(int[] nums, int target) {

            if(nums.length == 0) {
                return  new int[]{-1, -1};
            }
            int begin = 0;
            int end = nums.length-1;
            int[] result = new int[2];

            while (begin<end) {
                int mid = (begin + end) / 2;
                if (nums[mid]<target) {
                    begin = mid +1;
                } else {
                    end = mid;
                }
            }
            if(target == nums[begin]) {
                result[0] = begin;
            } else {
                result[0] = -1;
            }


            while (begin<end) {
                int mid = (begin + end) / 2 +1;
                if (nums[mid]>target) {
                    end = mid -1;
                } else {
                    begin = mid;
                }
            }
            if(target == nums[end]) {
                result[1] = end;
            } else {
                result[1] = -1;
            }

            return result;
        }
    }
}
