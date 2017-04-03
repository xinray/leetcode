package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ray on 3/28/17.
 */
public class Q22GenerateParentheses {
    public class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> result = new ArrayList<>();
            backtrack(result,"",0 ,0,n);

            return  result;
        }
        public void backtrack(List<String> list, String str,int open  ,int end, int n){

            if(str.length() == n*2) {
                list.add(str);
                return;
            }

            if(open<n) {
                backtrack(list,str+"(",open+1,end,n);
            }
            if(end <open){
                backtrack(list, str + ")", open, end + 1, n);
            }
        }
    }
}
