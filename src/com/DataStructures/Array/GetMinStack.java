package com.DataStructures.Array;

import java.util.Stack;

/**
 * 设计一个特殊的栈，每次弹出值和栈的最小值，要求时间复杂度为O（1）
 * 每次压栈的时候在min栈压入最小值
 * @since  2019年4月10日 下午9:21:16
 * @author luhao
 *
 */
public class GetMinStack {
	
	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;

	public void MyStack() {
		this.stackData = new Stack<Integer>();
		this.stackMin = new Stack<Integer>();
	}

	public void push(int newNum) {
		if (this.stackMin.isEmpty()) {
			this.stackMin.push(newNum);
		} else if (newNum < this.getmin()) {
			this.stackMin.push(newNum);
		} else {
			int newMin = this.stackMin.peek();
			this.stackMin.push(newMin);
		}
		this.stackData.push(newNum);
	}

	public int pop() {
		if (this.stackData.isEmpty()) {
			throw new RuntimeException("Your stack is empty.");
		}
		this.stackMin.pop();
		return this.stackData.pop();
	}

	public int getmin() {
		if (this.stackMin.isEmpty()) {
			throw new RuntimeException("Your stack is empty.");
		}
		return this.stackMin.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
