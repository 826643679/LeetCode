package com.luhao.shuzu.middle;

public class findDuplicate {

	public static void main(String[] args) {
		findDuplicate fd = new findDuplicate();
		int[] nums ={1,3,4,2,2};
		fd.findDuplicate(nums);
	}
	
    public int findDuplicate(int[] nums) {
        /**
        	快慢指针思想, fast 和 slow 是指针, nums[slow] 表示取指针对应的元素
        	注意 nums 数组中的数字都是在 1 到 n 之间的(在数组中进行游走不会越界),
        	因为有重复数字的出现, 所以这个游走必然是成环的, 环的入口就是重复的元素, 
        	即按照寻找链表环入口的思路来做
        **/
        int fast = 0, slow = 0;
        while(true) {
        	System.out.println("=======开始循环==========");
        	//无序的在数组间游走，快指针比慢指针快一倍	一定不会重复吗？
        	fast = nums[nums[fast]];	
            slow = nums[slow];		    
            
            if(slow == fast) {			//当两个元素值相等时
            	System.out.println("相等位"+slow);
                fast = 0;				//将快指针置为0
                System.out.println("while里的slow"+nums[slow] +"while里的fast"+nums[fast]);
                while(nums[slow] != nums[fast]) {
                    fast = nums[fast];
                    System.out.println("fast"+fast);
                    slow = nums[slow];
                    System.out.println("slow"+slow);
                }
                System.out.println("=======结束循环==========");
                System.out.println(nums[slow]);
                return nums[slow];
            }
        }
    }
}
