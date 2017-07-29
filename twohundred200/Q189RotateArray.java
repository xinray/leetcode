package leetcode.twohundred200;

/**
 * Created by ray on 7/29/17.
 */
public class Q189RotateArray {
    public void rotate(int[] nums, int k) {
        /// method 1
//        int[] a = new int[nums.length];
//        int len = nums.length;
//        for(int i=0;i<nums.length;i++) {
//            a[(i+k)%len] = nums[i];
//        }
//        for(int i=0;i<len;i++) {
//            nums[i] = a[i];
//        }
//        return;
//  }


        //method 2
        k %=nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] nums,int beg,int end){
        while(beg<end) {
            int tmp = nums[beg];
            nums[beg] = nums[end];
            nums[end] = tmp;
            beg++;
            end--;
        }
    }
}
