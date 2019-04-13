package com.zuoshen.Shuzu;

/**
 * 206 反转链表
 * 原本每个节点指向下一个节点，现在将指向改为前一个节点
 * @author Administrator
 *
 */
public class ReverseList {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	 }
	
	public ListNode reverseList(ListNode head) {
	    ListNode prev = null;			//头节点的前一个节点不存在，定义为null
	    ListNode curr = head;			//从头节点开始遍历 curr为当前节点
	    while (curr != null) {				
	        ListNode nextTemp = curr.next;	//定义临时节点存储当前节点的下一个节点
	        curr.next = prev;				//让当前节点指向前一个节点
	        prev = curr;					//将当前节点赋值给为前节点（遍历）
	        curr = nextTemp;				//让原下一个节点变为当前节点（遍历）
	    }
	    return prev;
	}
}
