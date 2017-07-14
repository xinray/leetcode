package leetcode.ninety90;

/**
 * Created by ray on 7/11/17.
 */
public class Q88MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1,k=m+n-1;
        while(i>-1 && j>-1) nums1[k--]=(nums1[i]>nums2[j])?nums1[i--]:nums2[j--];
        while(j>-1) nums1[k--] = nums2[j--];
    }
}
