package com.DataStructures.Array;

import java.util.Scanner;
import java.util.Vector;

/**
 * 对于严格递增的正整数数列 A=a1、 a2、 ……、 an， 如果一个正整数 T 满足：
 * 1） 对于数列 A 中的任意元素 x， 如果 x+T 不大于 an， 则 x+T 也是数列 A 中的元素
 * 2） 对于数列 A 中的任意元素 x， 如果 x-T 不小于 a1， 则 x-T 也是数列 A 中的元素
 * 那么称 T 为数列 A 的周期， 如果同时满足：
 * 3） 所有小于 T 的正整数， 都不是 A 的周期
 * 则称 T 为 A 的最小周期
 * 输入描述:
 * 每组测试样本的输入格式为：
 * 第一行是一个正整数 N
 * 从第二行开始， 每行有若干个正整数， 依次存放 n、 a1、 a2、 ……、 an， 一共有 N 行， 也
 * 就是 N 个数列。
 * 输出描述:
 * 输出有 N 行， 每行打印出对应数列的最小周期。
 *  3 
	3 1 2 3		1
	3 2 4 6		2
	3 3 4 6		3
 * @author Administrator
 *
 */
public class MinCycle {
	
	public static int minCycle(int [] num){
		//第一位为N
		int res = num[1];
		for (int i = 2; i < num.length; i++) {
				res = num[i]-num[i-1]>=res? Math.min(res, num[i]-num[i-1]):res;
		}
		return res;
	}
	
	public static void main(String[] args) {
		//int [] num = {1,2,3};
		//int [] num = {2,4,6};
		//int [] num = {3,4,6};
		
		Scanner sc1 = new Scanner(System.in);
		int sum = sc1.nextInt();			//输入N
		if(sum < 1) return;
		
		int [] res = new int [sum];
		for (int i = 0; i < sum; i++) {		//N行输入
			int [] tmp = new int [sum+1];
			Scanner sc2 = new Scanner(System.in);
			for (int j = 0; j < sum+1; j++) {
				tmp[j] = sc2.nextInt(); 
			}
			res[i]=minCycle(tmp);
		}
		
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

}
