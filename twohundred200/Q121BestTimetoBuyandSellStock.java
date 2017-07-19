package leetcode.twohundred200;

/**
 * Created by ray on 7/19/17.
 */
public class Q121BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
//        int maxprice = 0;
//        for(int i=0;i<prices.length-1;i++) {
//            for(int j =i;j<prices.length-1;j++) {
//                int profit = prices[j] - prices[i];
//                if (profit > maxprice)
//                    maxprice = profit;
//            }
//        }
//        return maxprice;


        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0;i<prices.length;i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
}
