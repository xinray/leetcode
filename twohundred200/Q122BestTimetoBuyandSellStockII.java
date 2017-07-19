package leetcode.twohundred200;

/**
 * Created by ray on 7/19/17.
 */
public class Q122BestTimetoBuyandSellStockII {

    //法一 超时
//    public int maxProfit(int[] prices) {
//        return calculate(prices,0);
//    }
//
//    public int calculate(int[] prices,int s) {
//        if (s>prices.length-1) return 0;
//        int max = 0;
//        for(int start = s; start<prices.length;start++) {
//            int maxprofit = 0;
//            for(int i = start+1; i<prices.length;i++) {
//                if(prices[start] < prices[i]) {
//                    int profit = calculate(prices,i+1) +prices[i] - prices[start];
//                    if(profit>maxprofit) maxprofit = profit;
//                }
//            }
//            if(maxprofit >max)
//                max = maxprofit;
//        }
//        return max;
//    }


//     法二
//    public int maxProfit(int[] prices) {
//        int maxprofit = 0;
//        int begin = 0;
//        int end =0;
//        for(int i =0;i<prices.length-1;i++) {
//            while(i<prices.length-1 && prices[i]>=prices[i+1]) {
//                i++;
//            }
//            begin = prices[i];
//            while(i<prices.length-1 && prices[i]<=prices[i+1]) {
//                i++;
//            }
//            end = prices[i];
//            maxprofit += end-begin;
//
//        }
//        return maxprofit;
//    }


    //法三

    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for(int i=0;i<prices.length-1;i++) {
            if(prices[i] <prices[i+1]) {
                maxprofit += prices[i+1] -prices[i];
            }
        }
        return maxprofit;
    }
}
