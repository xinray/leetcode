package leetcode.fourty40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ray on 4/14/17.
 */
public class Q40CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List arr = new ArrayList();

        getResult(result,new ArrayList<Integer>(), candidates,target,0);

        return result;
    }

    private void getResult(List<List<Integer>> result, List<Integer> cur, int candidates[], int target, int start){
        if(target > 0){
            for(int i = start; i < candidates.length && target >= candidates[i]; i++){
                if (i > start && candidates[i] == candidates[i-1]) continue;
                cur.add(candidates[i]);
                getResult(result, cur, candidates, target - candidates[i], i+1);
                cur.remove(cur.size() - 1);
            }//for
        } else if (target == 0 ){
            result.add(new ArrayList<Integer>(cur));
        }//else if
    }
}
