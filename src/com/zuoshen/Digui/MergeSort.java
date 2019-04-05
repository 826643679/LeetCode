package com.zuoshen.Digui;

import java.util.Arrays;

/**
 * 归并排序
 * 将一个数组拆分成两部分，先对左边进行排序，再对右边进行排序，将两个排完序之后的数组进行合并
 * (递归过程有点像俄罗斯套娃)
 * @since  2019年4月5日 上午10:34:47
 * @author luhao
 *
 */
public class MergeSort {

	public static void main(String[] args) {
		int [] arr={5,8,7,9,87,4,2};
		mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void mergeSort(int [] arr){
		if(arr == null || arr.length <2){
			return;
		}
		sortProcess(arr, 0, arr.length - 1);
	}
	
	public static void sortProcess(int [] arr,int L, int R){
		if (L == R) return ;
		//递归调用
		int mid = L+((R - L) >> 1); //L和R的中点位置(L+R)/2 也可写成(L+R) >>1
		sortProcess(arr,L,mid); 	//子过程先排左边
		sortProcess(arr,mid+1,R);	//子过程再排右边
		merge(arr,L,mid,R);
	}
	
	public static void merge(int[] arr, int L, int mid, int R){
		int [] help = new int[R - L + 1]; //添加辅助数组
		int i = 0;
		int p1 = L;
		int p2 = mid +1;
		while(p1 <= mid && p2 <= R){
			//谁小填谁
			//i++ 先用再加
			help[i++] = arr[p1] < arr[p2] ? arr[p1++]:arr[p2++];
		}
		//两个必有且只有一个越界
		while(p1 <= mid){
			help[i++] = arr[p1++];
		}
		while(p2 <= R){
			help[i++] = arr[p2++];
		}
		//排序完之后再填回
		for(i = 0; i<help.length;i++){
			arr[L+i] = help[i];
		}
	}
	
}
