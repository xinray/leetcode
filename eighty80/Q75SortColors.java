/**
 * Created by wanxinrui on 2017/7/10.
 */
public class Q75SortColors {
    public void sortColors(int[] nums) {
        if( nums == null ||nums.length<2) return;
        int low =0,high = nums.length-1;
        for(int i = low ; i<high;i++) {
            if(nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[low];
                nums[low]=temp;
                i++;low++;
            } else if(nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[high];
                nums[high]=temp;
                high--;
            } else {
                i++;
            }
        }
    }
}
