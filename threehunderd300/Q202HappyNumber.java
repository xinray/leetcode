package leetcode.threehunderd300;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ray on 7/29/17.
 */
public class Q202HappyNumber {
    public boolean isHappy(int n) {
        Set st = new HashSet();
        int result=0,samp=0;

        while(st.add(n)) {
            samp=0;
            while(n>0) {
                result = n%10;
                samp += result*result;
                n = n/10;
            }
            if(samp == 1) {
                return  true;
            } else {
                n = samp;
            }
        }
        return false;
    }
}
