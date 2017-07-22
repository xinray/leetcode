package leetcode.twohundred200;

import java.util.HashMap;

/**
 * Created by ray on 7/22/17.
 */
public class Q167TwoSumIIInputarrayissorted {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ts = new int[2];
        for(int i = 0; i< numbers.length; i++) {

            if(map.containsKey(numbers[i])) {
                int j = map.get(numbers[i]);
                ts[0] =j+1;
                ts[1] =i+1;
            } else {
                map.put(target-numbers[i],i);
            }
        }
        return ts;
    }
}
