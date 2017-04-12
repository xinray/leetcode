 package leetcode;

/**
 * Created by ray on 3/28/17.
 */
public class Q35SearchInsertPosition {
    public class Solution {
        public int searchInsert(int[] nums, int target) {
            int beg=0, end=nums.length-1;

            if(nums.length ==0) return 0;
            while(beg<=end){
                int mid = (beg+end)/2;
                if(nums[mid] == target) return mid;
                else if(nums[mid] > target) end = mid-1;
                else beg = mid+1;
            }
            return beg;
        }
    }
}
