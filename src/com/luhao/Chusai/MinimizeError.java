package com.luhao.Chusai;

import java.util.Arrays;

/**
 * 3. 最小化舍入误差以满足目标  显示英文描述  
用户通过次数 107
用户尝试次数 219
通过次数 110
提交次数 708
题目难度 Medium
给定一系列价格 [p1,p2...,pn] 和一个目标 target，将每个价格 pi 舍入为 Roundi(pi) 以使得舍入数组 [Round1(p1),Round2(p2)...,Roundn(pn)] 之和达到给定的目标值 target。每次舍入操作 Roundi(pi) 可以是向下舍 Floor(pi) 也可以是向上入 Ceil(pi)。
如果舍入数组之和无论如何都无法达到目标值 target，就返回 -1。否则，以保留到小数点后三位的字符串格式返回最小的舍入误差，其定义为 Σ |Roundi(pi) - (pi)|（ i 从 1 到 n ）。
 *
 * @since  2019年4月14日 下午6:39:24
 * @author luhao
 *
 */
public class MinimizeError {

    public static String minimizeError(String[] prices, int target) {
    	double hsum = 0,lsum = 0,equh = 0,equl = 0,sum = 0;
    	String res = "";
    	for (int i = 0; i < prices.length; i++) {
    		hsum += Math.ceil(Double.parseDouble(prices[i]));
    		lsum += Math.floor(Double.parseDouble(prices[i]));
    		equh += Math.ceil(Double.parseDouble(prices[i]))-Double.parseDouble(prices[i]);
    		equl += Double.parseDouble(prices[i]) - Math.floor(Double.parseDouble(prices[i]));
    		sum += Double.parseDouble(prices[i]);
		}
    	if(target > hsum || lsum > target) res = "-1";
    	if(target == hsum ) res=String.valueOf(equh);
    	if(target == lsum ) res=String.valueOf(equl);
    	
    	
    	//特殊情况 总和 比8多0.4 所以计算出所有和满足等于0.4
    	//前小后大，前面的向下舍，后面的向上舍
    	double flag = sum - target;
    	double[] db = new double[prices.length];
    	Arrays.sort(db);
    	double qian = 0,hou = 0;
    	//(未完成)
    	for (int i = 0; i < prices.length; i++) {
		}
    	System.out.println(res);
    	return res;
    }
	
	public static void main(String[] args) {
		String[] prices = {"0.700","2.800","4.900"};
		int target = 8;
		minimizeError(prices,target);
	}

}
