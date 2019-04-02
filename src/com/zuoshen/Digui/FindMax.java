package com.zuoshen.Digui;

/**
 * 递归寻找最大值
 * 递归思路：左边找出最大值，右边找出最大值，两个对比，大的就是最大值
 * @since  2019年4月2日 下午11:34:00
 * @author luhao
 *
 */
public class FindMax {
	/**
	 * 递归函数就是系统在替你压栈
	 * @param arr
	 * @param L
	 * @param R
	 * @return
	 */
	public static int getMax(int [] arr,int L,int R){
		//终止条件 
		if(L==R){
			return arr[L];
		}
		int mid = (L+R)/2;	//中间值
		int maxLeft = getMax(arr,L,mid);	//先算左边的最大值
		int maxRight = getMax(arr,mid+1,R);	//再算右边的最大值
		return Math.max(maxLeft, maxRight);	//返回值
	}
	
	public static void main(String[] args) {
		int [] arr={5,8,7,9,87,4,2};
		System.out.println(getMax(arr,0,arr.length-1));
	}

}
