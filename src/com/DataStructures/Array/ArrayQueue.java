package com.DataStructures.Array;

/**
 * 固定数组实现队列
 *
 * @since  2019年4月10日 上午7:51:22
 * @author luhao
 *
 */
public class ArrayQueue {
	private Integer[] arr;
	private Integer size;
	private Integer first;	//队列头
	private Integer last;	//队列尾

	public ArrayQueue(int initSize) {
		if (initSize < 0) {
			throw new IllegalArgumentException("The init size is less than 0");
		}
		arr = new Integer[initSize];
		size = 0;
		first = 0;
		last = 0;
	}

	public Integer peek() {
		if (size == 0) {
			return null;
		}
		return arr[first];
	}

	public void push(int obj) {
		if (size == arr.length) {
			throw new ArrayIndexOutOfBoundsException("The queue is full");
		}
		size++;
		arr[last] = obj;
		last = last == arr.length - 1 ? 0 : last + 1;	//当队列尾来到数组最大值时，接下来移动到数组最开始的位置
	}

	public Integer poll() {
		if (size == 0) {
			throw new ArrayIndexOutOfBoundsException("The queue is empty");
		}
		size--;
		int tmp = first;
		first = first == arr.length - 1 ? 0 : first + 1;	//同上
		return arr[tmp];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
