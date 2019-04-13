package com.zuoshen.Shuzu;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列实现栈
 * 将队列1的数据除最后1位都放到队列2
 * 注意：队列poll返回的只能是头值，每次queue保留一个值，help只能先进先出，因此需要交换queue和help用while保持queue只有一个值
 * @author Administrator
 *
 */

public class MyStack {
		Queue<Integer> queue = new LinkedList<>();
		Queue<Integer> help = new LinkedList<>();
		
	    /** Initialize your data structure here. */
	    public MyStack() {
	    	queue = this.queue;
	    	help = this.help;
	    }
	    
	    /** Push element x onto stack. */
	    public void push(int x) {
	    	queue.add(x);
	    	while(queue.size()>1){
	    		help.add(queue.poll());
	    	}
	    	System.out.println("stack: "+queue+" ,help: "+help);
	    }
	    
	    /** Removes the element on top of the stack and returns that element. */
	    public int pop() {
	    	int tmp = 0;
	    	//poll 移除并返回队列头的元素
	    	if(!queue.isEmpty()){
	    		tmp = queue.poll();
	    	}
	    	if(!help.isEmpty()){
		    	 while(help.size()>1){
		    		 queue.add(help.poll());
		    	 }
		    	 Queue<Integer> temp = new LinkedList<>(); 
		    	 temp = queue;
		    	 queue = help;
		    	 help = temp;
	    	}
	    	
	    	System.out.println("stack: "+queue+" ,help: "+help);
	    	return tmp;
	    }
	    
	    /** Get the top element. */
	    public int top() {
	        return queue.peek();
	    }
	    
	    /** Returns whether the stack is empty. */
	    public boolean empty() {
	        if(queue.isEmpty()&&help.isEmpty()){
	        	return true;
	        }
	        return false;
	    }
	    
	    public static void main(String[] args) {
	    	MyStack ms = new MyStack();
	    	ms.push(1);
	    	ms.push(2);
	    	ms.push(3);
	    	ms.pop();
	    	ms.pop();
	    	ms.pop();
	    	ms.empty();
		}
}
