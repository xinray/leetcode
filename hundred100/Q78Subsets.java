import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wanxinrui on 2017/7/10.
 */
public class Q78Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> combs = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        combine(combs, new ArrayList<Integer>(), nums,0);
        return combs;
    }
    public void combine(List<List<Integer>> combs,List<Integer> cb ,int[] nums,int start){
        combs.add(new ArrayList<>(cb));
        for(int i=start;i<nums.length;i++) {
            cb.add(nums[i]);
            combine(combs, cb, nums, i + 1);
            cb.remove(cb.size() - 1);
        }
    }
}
