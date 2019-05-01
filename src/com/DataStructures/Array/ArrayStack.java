package com.DataStructures.Array;

/**
 * 固定数组实现栈
 *
 * @since  2019年4月10日 上午7:14:51
 * @author luhao
 *
 */
public class ArrayStack {
		private Integer[] arr;		//初始化数组
		private Integer size;		//指针的大小 栈的当前大小+1

		public ArrayStack(int initSize) {
			if (initSize < 0) {
				throw new IllegalArgumentException("The init size is less than 0");
			}
			arr = new Integer[initSize];
			size = 0;
		}

		public Integer peek() {		//查看栈顶的数
			if (size == 0) {
				return null;
			}
			return arr[size - 1];
		}

		public void push(int obj) {		//压栈
			if (size == arr.length) {
				throw new ArrayIndexOutOfBoundsException("The queue is full");
			}
			arr[size++] = obj;
		}

		public Integer pop() {			//出栈
			if (size == 0) {
				throw new ArrayIndexOutOfBoundsException("The queue is empty");
			}
			return arr[--size];
		}
	public static void main(String[] args) {

	}

}
