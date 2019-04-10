package com.luhao.shuzu.easy;

/**
 * 122. 买卖股票的最佳时机 II
 * 可以多次买卖一只股票获取最大利润
 * 
 * [7, 1, 5, 6] 第二天买入，第四天卖出，收益最大（6-1），所以一般人可能会想，怎么判断不是第三天就卖出了呢? 
 * 这里就把问题复杂化了，根据题目的意思，当天卖出以后，当天还可以买入，所以其实可以第三天卖出，第三天买入，第四天又卖出（（5-1）+ （6-5） === 6 - 1）。
 * 所以算法可以直接简化为只要今天比昨天大，就卖出。
 *
 * @author Administrator
 *
 */
public class MaxProfit {
	
    public static int maxProfit(int[] prices) {
		if(prices.length<2) return 0;
		int res = 0;
		for (int i = 0; i < prices.length-1; i++) {
			if(prices[i] < prices[i+1]){		//卖出
				res += prices[i+1] - prices[i];
			}
		}
		//System.out.println(res);
    	return res;
    }
    
	public static void main(String[] args) {
		int [] prices = {7,6,4,3,1};
		maxProfit(prices);
	}

}
