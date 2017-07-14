/**
 * Created by wanxinrui on 2017/7/10.
 */
public class Q70ClimbingStairs {
    public int climbStairs(int n) {
        int[] dig = new int[n];
        if(n <= 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        dig[0] = 1;
        dig[1] = 2;
        for(int i = 2 ; i<n ;i++) {
            dig[i] = dig[i-1] + dig[i-2];
        }
        return dig[n-1];
    }
}
