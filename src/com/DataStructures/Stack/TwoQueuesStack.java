package com.DataStructures.Stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列实现栈
 * 用两个队列，第一个队列只留最后一个数，第二个队列放剩下的数
 * 进数永远进queue，取数时将queue的前面的数都放help中，然后将最后一个数放queue并返回
 * @since  2019年4月10日 下午9:35:12
 * @author luhao
 *
 */
	public class TwoQueuesStack {
		private Queue<Integer> queue;
		private Queue<Integer> help;

		public TwoQueuesStack() {
			queue = new LinkedList<Integer>();
			help = new LinkedList<Integer>();
		}

		public void push(int pushInt) {
			queue.add(pushInt);
		}

		public int peek() {
			if (queue.isEmpty()) {
				throw new RuntimeException("Stack is empty!");
			}
			while (queue.size() != 1) {
				help.add(queue.poll());
			}
			int res = queue.poll();
			help.add(res);
			swap();
			return res;
		}

		public int pop() { 
			if (queue.isEmpty()) {
				throw new RuntimeException("Stack is empty!");
			}
			while (queue.size() > 1) {
				help.add(queue.poll());
			}
			int res = queue.poll();
			swap();
			return res;
		}
		
		/**
		 * 交换引用
		 */
		private void swap() {
			Queue<Integer> tmp = help;
			help = queue;
			queue = tmp;
		}

	}
	

