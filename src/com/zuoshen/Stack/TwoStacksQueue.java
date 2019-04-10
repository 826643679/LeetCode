package com.zuoshen.Stack;

import java.util.Stack;

/**
 * 栈实现队列
 * 用两个栈，第一个栈正常存放数据，然后取数的时候将第一个栈的数据取出存到第二个栈
 * 再从第二个栈取数即可
 * @since  2019年4月10日 下午9:47:06
 * @author luhao
 *
 */
public class TwoStacksQueue {
	private Stack<Integer> stackPush;
	private Stack<Integer> stackPop;

	public TwoStacksQueue() {
		stackPush = new Stack<Integer>();
		stackPop = new Stack<Integer>();
	}

	public void push(int pushInt) {
		stackPush.push(pushInt);
	}

	public int poll() {
		if (stackPop.empty() && stackPush.empty()) {
			throw new RuntimeException("Queue is empty!");
		} else if (stackPop.empty()) {
			while (!stackPush.empty()) {
				stackPop.push(stackPush.pop());
			}
		}
		return stackPop.pop();
	}

	public int peek() {
		if (stackPop.empty() && stackPush.empty()) {
			throw new RuntimeException("Queue is empty!");
		} else if (stackPop.empty()) {
			while (!stackPush.empty()) {
				stackPop.push(stackPush.pop());
			}
		}
		return stackPop.peek();
	}
}
}
