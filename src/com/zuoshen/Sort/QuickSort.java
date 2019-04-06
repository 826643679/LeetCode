package com.zuoshen.Sort;

/**
 * 快排
 * 时间复杂度O（N*logN）（随机快排的）额外空间复杂度O（logN）
 * @since  2019年4月6日 下午3:06:51
 * @author luhao
 *
 */
public class QuickSort {
	
	public static void quickSort(int [] arr,int L,int R){
		if(L<R){
			swap(arr,L+(int)(Math.random() * (R-L+1)),R); //随机选一个数和最后一个位置的数交换，然后用这个数来做划分
			int [] p = partition(arr,L,R);	//优化，不用比较中间相等区域的数 
			quickSort(arr,L,p[0]-1);
			quickSort(arr,p[1]+1,R);
		}
	}
	
	private static int[] partition(int[] arr, int L, int R) {
		int less = L -1;
		int more = R;	//按照最后一个值做划分
		while(L<more){
			if(arr[L]<arr[R]){
				swap(arr,++less,L++);
			}else if(arr[L]>arr[R]){
				swap(arr,--more,L);
			}else{
				L++;
			}
		}
		swap(arr,more,R);
		return new int [] {less+1,more};	//返回的是相等区域的左右边界 
	}

	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public static void main(String[] args) {

	}

}
