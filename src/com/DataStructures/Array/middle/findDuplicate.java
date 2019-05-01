package com.DataStructures.Array.middle;

public class findDuplicate {

	public static void main(String[] args) {
		findDuplicate fd = new findDuplicate();
		int[] nums ={1,3,4,2,2};
		fd.findDuplicate(nums);
	}
	
    public int findDuplicate(int[] nums) {
        /**
        	����ָ��˼��, fast �� slow ��ָ��, nums[slow] ��ʾȡָ���Ӧ��Ԫ��
        	ע�� nums �����е����ֶ����� 1 �� n ֮���(�������н������߲���Խ��),
        	��Ϊ���ظ����ֵĳ���, ����������߱�Ȼ�ǳɻ���, ������ھ����ظ���Ԫ��, 
        	������Ѱ��������ڵ�˼·����
        **/
        int fast = 0, slow = 0;
        while(true) {
        	System.out.println("=======��ʼѭ��==========");
        	//���������������ߣ���ָ�����ָ���һ��	һ�������ظ���
        	fast = nums[nums[fast]];	
            slow = nums[slow];		    
            
            if(slow == fast) {			//������Ԫ��ֵ���ʱ
            	System.out.println("���λ"+slow);
                fast = 0;				//����ָ����Ϊ0
                System.out.println("while���slow"+nums[slow] +"while���fast"+nums[fast]);
                while(nums[slow] != nums[fast]) {
                    fast = nums[fast];
                    System.out.println("fast"+fast);
                    slow = nums[slow];
                    System.out.println("slow"+slow);
                }
                System.out.println("=======����ѭ��==========");
                System.out.println(nums[slow]);
                return nums[slow];
            }
        }
    }
}
