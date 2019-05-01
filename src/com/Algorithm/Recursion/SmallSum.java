package com.Algorithm.Recursion;

import java.util.Arrays;

/**
 * 小和问题
 * 每次取数组元素左边比它小的数，然后相加求和
 * @since  2019年4月5日 下午2:55:52
 * @author luhao
 *
 */
public class SmallSum {
	
	public static int smallSum(int [] arr){
		if(arr==null || arr.length < 2){
			return 0;
		}
		return mergeSort(arr,0,arr.length-1);
	}
	
	
	
	private static int mergeSort(int[] arr, int l, int r) {
		if(l==r) return 0;
		int mid = l+((r-l) >> 1); 	//防止溢出
		return mergeSort(arr,l,mid)	//左边部分的小和
				+mergeSort(arr,mid+1,r)	//右边部分的小和
				+merge(arr,l,mid,r);
	}
	

	private static int merge(int[] arr, int l, int mid, int r) {
		int [] help = new int[r-l+1];
		int i = 0;
		int p1 = 1;
		int p2 = mid +1;
		int res = 0;
		while(p1 <= mid && p2 <=r){
			//判断数组左边元素是否小于数组右边元素，当成立时右边元素个数乘以数组左边元素值
			res += arr[p1] <arr[p2] ? (r-p2+1)*arr[p1]:0;
			//当左边元素
			help[i++] = arr[p1] <arr[p2] ?arr[p1++]:arr[p2++];
		}
		//System.out.println(Arrays.toString(help));
		while(p1<= mid){
			help[i++] = arr[p1++];
		}
		while(p2<=r){
			help[i++] = arr[p2++];
		}
		for ( i = 0; i < help.length; i++) {
			arr[l+i] = help[i];
		}
		return res;
	}

	/**
	 * 运行报错。
	 * @param args
	 */

	public static void main(String[] args) {
		int [] arr={5,8,7,9,87,4,2};
		smallSum(arr);
	}
	
	
}
