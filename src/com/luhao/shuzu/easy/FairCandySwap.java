package com.luhao.shuzu.easy;

import java.util.Arrays;

/**
 * 爱丽丝和鲍勃有不同大小的糖果棒：A[i] 是爱丽丝拥有的第 i 块糖的大小，B[j] 是鲍勃拥有的第 j 块糖的大小。
 * 因为他们是朋友，所以他们想交换一个糖果棒，这样交换后，他们都有相同的糖果总量。（一个人拥有的糖果总量是他们拥有的糖果棒大小的总和。）
 * 返回一个整数数组 ans，其中 ans[0] 是爱丽丝必须交换的糖果棒的大小，ans[1] 是 Bob 必须交换的糖果棒的大小。
 * 如果有多个答案，你可以返回其中任何一个。保证答案存在。
 * 输入：A = [1,1], B = [2,2]
 * 输出：[1,2]
 * 
 * @since  2019年3月19日 下午8:38:33
 * @author luhao
 *
 */
public class FairCandySwap {

	public static void main(String[] args) {
		FairCandySwap fcs = new FairCandySwap();
		int[] A = {1,1};
		int[] B = {2,2};
		fcs.fairCandySwap(A, B);
	}
	
	/**
	 * 先分别计算两个数组之和
	 * 进行循环分别减去一个元素再加上另一个数组减去的元素 当两个值相等时加入到新创建的数组中
	 * @param A
	 * @param B
	 * @return
	 */
    public int[] fairCandySwap(int[] A, int[] B) {
    	int a = 0, b = 0;
    	int [] flag = new int [2];
    	//分别计算两个数组的和
        for (int i = 0; i < A.length; i++) {
			a+=A[i];
		}
        for (int i = 0; i < B.length; i++) {
			b+=B[i];
		}
        
        for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if(a-2*(A[i]-B[j])==b){
					flag[0]=A[i];
					flag[1]=B[j];
				}
			}
		}
       return flag;
    }
}
