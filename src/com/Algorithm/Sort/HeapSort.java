package com.Algorithm.Sort;

import java.util.Arrays;

/**
 * 堆排序(优先级队列/贪心)
 * 堆：完全二叉树    时间复杂度（OlogN）
 * 大根堆：任何一棵子树的最大值都是这个树的头部。 小根堆：任何一棵子树的最小值都是这个树的头部。
 * @since  2019年4月6日 下午8:22:48
 * @author luhao
 *
 */
public class HeapSort {
	
	/**
	 * 每次将堆顶的元素（最大值）换到最后一位，然后再用heapify调整堆，数组大小-1，最后数组就是一个升序的
	 * @param arr
	 */
	public static void heapSort(int [] arr){
		if(arr == null || arr.length <2) return;
		for (int i = 0; i < arr.length; i++) {
			heapInsert(arr,i);  //0-i
		}
		int heapSize = arr.length;
		swap(arr,0,--heapSize);
		while(heapSize>0){
			heapify(arr,0,heapSize);
			swap(arr,0,--heapSize);
		}
	}
	
	/**
	 * 建立大根堆：每次插入一个元素比较这个元素和父节点的大小，当它比父节点大时，将它替换到父节点上
	 * 父节点在数组中的下标值：(index - 1)/2
	 * 当父节点下标为0时，-1/2=0，会停止循环
	 * @param arr
	 * @param index
	 */
	private static void heapInsert(int[] arr, int index) {
		while(arr[index] > arr[(index - 1)/2]){
			swap(arr,index,(index -1)/2);
			index = (index -1)/2;
		}
	}
	
	/**
	 * 调整堆：当堆的数据发生变化导致不是一个大根堆时（值变小下沉）
	 * 当知道父节点下标时，左孩子节点在数组中的下标值为（2*i+1），右孩子节点在数组中的下标值为（2*i+2）
	 * @param arr
	 * @param index
	 * @param heapSize
	 */
	private static void heapify(int[] arr, int index, int heapSize) {
		int left = index * 2 +1; 	//左孩子下标
		while(left<heapSize){		//当没有越界时
			int largest = left +1<heapSize && arr[left+1]>arr[left] 	//右孩子的下标不越界并且右孩子的值比左孩子的值大
					?left+1		//最大为右
					:left;		//最大为左
			largest = arr[largest] > arr[index]?largest :index; 	//当孩子节点的值比父节点的值大时，最大下标为孩子节点的下标
			if(largest==index) break;	//当父节点最大时直接跳出
			swap(arr, largest, index);	//父节点下沉
			index = largest;
			left = index*2 + 1;		//left继续向下
		}
	}


	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}


	public static void main(String[] args) {
		int[] arr = { 1, 4, 8, 4, 9, 7, 5, 6 };
		heapSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
