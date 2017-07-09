package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ray on 1/3/17.
 */
public class threesum {
    public class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> resultList = new ArrayList<List<Integer>>();
            if (nums == null || nums.length < 3) return resultList;

            Arrays.sort(nums);

            for(int i = 0 ; i< nums.length-2; i++) {
                int target = 0 - nums[i];
                int left =  i + 1;
                int right = nums.length - 1;
                int temp = 0;

                while(left < right) {
                    temp =  nums[left] + nums[right];
                    if( temp > target) {
                        right--;
                    } else if(temp < target) {
                        left++;
                    } else if(temp == target){
                        List<Integer> result = new ArrayList<>();
                        result.add(nums[i]);
                        result.add(nums[left]);
                        result.add(nums[right]);
                        resultList.add(result);
                        while (left < right && nums[right] == nums[right-1]) { right--;  }
                        while (left < right && nums[left] == nums[left+1]) { left++;  }
                        left++;
                        right--;
                    }

                }
                while ( i+1<nums.length && nums[i] == nums[i+1]) { i++;  }
            }
            return resultList;
        }

    }
}
