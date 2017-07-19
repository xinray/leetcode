package leetcode.twohundred200;

import java.util.Arrays;

/**
 * Created by ray on 7/19/17.
 */
public class Q123BestTimetoBuyandSellStockIII {
    public int maxProfit(int[] prices) {
        int sell1 = 0, sell2 = 0, buy1 = Integer.MIN_VALUE, buy2 = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            buy1 = Math.max(-prices[i],buy1);
            sell1 = Math.max(sell1,buy1 + prices[i]);
            buy2 = Math.max(buy2, sell1 - prices[i]);
            sell2 = Math.max(sell2,buy2+prices[i]);
        }
        return sell2;
    }
}
