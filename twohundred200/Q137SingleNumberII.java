package leetcode.twohundred200;

/**
 * Created by ray on 7/20/17.
 *
 *
 * 没想到可以用 或与非来做   用00-01-10 自己形成一个循环闭圈。
 */
public class Q137SingleNumberII {
    public int singleNumber(int[] nums) {
        int na = 0, nb = 0, nc = 0;
        for(int i = 0; i < nums.length; i++){
            nb = nb ^ (nums[i] & na);
            na = (na ^ nums[i]) & ~nc;
            nc = nc ^ (nums[i] & ~na & ~nb);
        }
        return na & ~nb & ~nc;
    }
}
