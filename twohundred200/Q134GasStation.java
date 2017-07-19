package leetcode.twohundred200;

/**
 * Created by ray on 7/20/17.
 */
public class Q134GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum =0,start=0,total =0;
        for(int i=0;i<gas.length;i++) {
            sum+=gas[i]-cost[i];
            if(sum<0){
                total +=sum;
                start = i+1;
                sum =0;
            }

        }
        total+=sum;
        return (total<0)?-1:start;
    }
}
