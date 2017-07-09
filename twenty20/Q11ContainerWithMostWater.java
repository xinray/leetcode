package leetcode.twenty20;

/**
 * Created by ray on 3/28/17.
 */
public class Q11ContainerWithMostWater {
    public class Solution {
        public int maxArea(int[] height) {
            int i=0 ,j=height.length-1;
            int water=0;
            while(i<j) {
                water=Math.max(water,Math.min(height[i],height[j])*(j-i));
                if(height[i]<height[j]) {
                    i++;
                } else {
                    j--;
                }
            }

            return water;
        }
    }
}
