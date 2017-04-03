package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ray on 3/28/17.
 */
public class Q9PalindromeNumber {
    public class Solution {
        public boolean isPalindrome(int x) {

            if(x<0 || (x!=0 && x%10==0)) return false;
            int ret =0;

            while(ret<x ) {
                ret = ret*10 +x%10;
                x=x/10;
            }
            return (x==ret || x == ret/10);
        }
    }
}
