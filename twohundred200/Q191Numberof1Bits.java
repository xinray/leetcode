package leetcode.twohundred200;

/**
 * Created by ray on 7/29/17.
 */
public class Q191Numberof1Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int sum =0;
        for(int i=0;i<32;i++) {
            if((n&1) == 1) sum++;
            n>>=1;
        }
        return sum;
    }
}
