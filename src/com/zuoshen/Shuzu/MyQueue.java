package com.zuoshen.Shuzu;

import java.util.Stack;


/**
 * 栈实现队列
 * @author Administrator
 * 数进完第一个栈之后，出栈把数存到第二个栈，再取第二个栈的数就OK
 */
public class MyQueue {
	
		 Stack queue = new Stack();
	     Stack help = new Stack();

	    /** Initialize your data structure here. */
	    public MyQueue() {
	    	queue = this.queue;
	    	help = this.help;
	    }
	    
	    /** Push element x to the back of queue. */
	    public void push(int x) {
	    	while(!help.isEmpty()){
	    		queue.push(help.pop());
	    	}
	    	queue.push(x);
	    }
	    
	    /** Removes the element from in front of queue and returns that element. */
	    public int pop() {
	    	while(!queue.isEmpty()){
	    		help.push(queue.pop());
	    	}
	    	return (int) help.pop();
	    }
	    
	    /** Get the front element. */
	    public int peek() {
	    	while(!queue.isEmpty()){
	    		help.push(queue.pop());
	    	}
	    	return (int) help.peek();
	    }
	    
	    /** Returns whether the queue is empty. */
	    public boolean empty() {
	        if(queue.isEmpty()&&help.isEmpty()){
	        	return true;
	        }else{
	        	return false;
	        }
	    }

}
