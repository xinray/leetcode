package leetcode.sixty60;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ray on 7/9/17.
 */
public class Q60PermutationSequence {
    public class Solution {
         int[] facts = new int[10];
        {
            facts[1] = 1;
            for (int i=2;i<=9;i++){
                facts[i] = facts[i-1]*i;
            }
        }
        public String getPermutation(int n, int k) {
            StringBuilder s = new StringBuilder();
            List<Integer> digits = new LinkedList<Integer>();
            for (int i=1;i<=n;i++){
                digits.add(i);
            }
            k = k-1; //make zero based;
            while (k>0 && digits.size()>1){//k==0 means remaining digits in the list are ordered.
                int segmentLength = facts[digits.size()-1];
                int index =  k/segmentLength;
                k = k%segmentLength; //calculate new k
                s.append(digits.remove(index));
            }
            for (int i:digits){//add remaining digits
                s.append(i);
            }
            return s.toString();
        }
    }
}
