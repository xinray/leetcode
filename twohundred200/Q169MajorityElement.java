package leetcode.twohundred200;

/**
 * Created by ray on 7/22/17.
 */
public class Q169MajorityElement {
    public int majorityElement(int[] nums) {
        int major = nums[0],count =0;

        for(int i= 0;i<nums.length;i++) {
            if(count == 0) {
                count++;
                major=nums[i];
            } else if(major == nums[i]){
                count++;
            } else {
                count--;
            }
        }
        return major;
    }
}
