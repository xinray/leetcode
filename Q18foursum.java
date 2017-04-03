import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ray on 1/3/17.
 */
public class foursum {
    public class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> resultList = new ArrayList<List<Integer>>();
            List<Integer> result = new ArrayList<Integer>();

            if(nums ==null || nums.length <4 ) return resultList;
            Arrays.sort(nums);

            for(int i=0; i<nums.length-3;i++) {
                if(i>0&& nums[i]== nums[i-1]) continue;
                for(int j=i+1; j<nums.length-2;j++) {
                    if(j>i+1 && nums[j]== nums[j-1]) continue;
                    int low = j+1;
                    int high = nums.length-1;
                    while (low<high) {
                        int sum = nums[i] +  nums[j] + nums[low] + nums[high];
                        if(sum==target) {
                            resultList.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high]));
                            while(low<high&&nums[low]==nums[low+1])low++;
                            while(low<high&&nums[high]==nums[high-1])high--;
                            low++;
                            high--;
                        } else if(sum<target)low++;
                        else high--;
                    }
                }
            }

            return resultList;
        }
    }
}
