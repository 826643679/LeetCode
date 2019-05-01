package com.Algorithm.Sort;

import java.util.Arrays;

/**
 * 荷兰国旗问题
 * 将小于num的数放数组左边，大于num的数放右边，等于num的数放中间
 * @since  2019年4月5日 下午10:46:55
 * @author luhao
 *
 */
public class NetherlandsFlag {
	
	public static int [] partition(int [] arr,int L,int R,int num){
		int less = L-1;
		int more = R+1;
		while(L < more){ 	//当左指针和右指针没相遇
			if(arr[L]<num){
				swap(arr,++less,L++); //L和小于区域的下一个数交换  //小于区域推着等于区域向右跑，所以底下L不用++
			}else if(arr[L]>num){
				swap(arr,--more,L);
			}else {	 //当等于时，什么都不做，指针直接右移
				L++;
			}
		}
		return new int[] { less + 1,more -1};	//暂时没用，返回的是等于区域的左右边界
	}
	
	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 8, 4, 9, 7, 5, 6 };
		partition(arr,0,arr.length-1,5);
		System.out.println(Arrays.toString(arr));
	}

}
