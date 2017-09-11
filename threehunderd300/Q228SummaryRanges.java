package leetcode.threehunderd300;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ray on 8/27/17.
 */
public class Q228SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> li = new ArrayList<>();

        if(nums.length==1){
            li.add(nums[0]+"");
            return li;
        }

        for(int i=0 ; i<nums.length;i++) {
            int beg = nums[i];
            while(i+1<nums.length&&(nums[i+1]-nums[i])==1) {
                i++;
            }
            if(beg!=nums[i]){
                li.add(beg+"->"+nums[i]);
            }else{
                li.add(beg+"");
            }
        }
        return li;
    }
}
