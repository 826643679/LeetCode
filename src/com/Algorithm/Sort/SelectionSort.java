package com.Algorithm.Sort;

import java.util.Arrays;

/**
 * 选择排序法（已经不用了） 每次遍历数组找出最小的数依次排在前面
 * 
 * @since 2019年3月28日 上午8:40:19
 * @author luhao
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();
		int[] arr = { 1, 4, 8, 4, 9, 7, 5, 6 };
		ss.selectionSort(arr);
	}

	public static void selectionSort(int[] arr) {
		if (arr == null || arr.length < 2) { // 特殊情况处理
			return;
		}

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i; // 定义第一位为最小值
			for (int j = i + 1; j < arr.length; j++) { // 从第二位开始遍历
				minIndex = arr[j] < arr[minIndex] ? j : minIndex; // 当遇到比minIndex小的数据时，将下标换成对应的（三目运算）
			}
			swap(arr, i, minIndex);
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
