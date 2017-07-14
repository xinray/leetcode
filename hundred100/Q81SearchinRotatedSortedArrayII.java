package leetcode.ninety90;

/**
 * Created by ray on 7/10/17.
 */
public class Q81SearchinRotatedSortedArrayII {
    public class Solution {
        public boolean search(int[] nums, int target) {
            int len = nums.length;
            int begin=0, end=len-1;

            while(begin<=end) {
                int middle=(begin+end)/2;
                if(nums[middle] == target) {
                    return true;
                } else if (nums[begin] > nums[middle]) {
                    if(target > nums[end]) {
                        end = middle-1;
                    } else if(target < nums[middle]) {
                        end = middle - 1;
                    }else {
                        begin = middle +1;
                    }
                } else if(nums[begin] < nums[middle]) {
                    if(target >= nums[begin] && target < nums[middle]) {
                        end = middle-1;
                    } else {
                        begin = middle +1;
                    }
                } else {
                    if(nums[end] != nums[middle]) {
                        begin = middle +1;
                    } else {
                        boolean flag = true;
                        for(int k = 1; middle -k >= begin && middle+k<=end; k++) {
                            if(nums[middle+k] != nums[middle]) {
                                begin = middle+1;
                                flag = false;
                                break;
                            } else if(nums[middle-k] != nums[middle]) {
                                end = middle -1;
                                flag = false;
                                break;
                            }
                        }
                        if(flag)
                            return false;
                    }
                }
            }

            return false;
        }
    }
}
