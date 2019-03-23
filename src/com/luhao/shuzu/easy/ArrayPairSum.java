package com.luhao.shuzu.easy;

import java.util.Arrays;

/**
 * ��������Ϊ 2n ������, ��������ǽ���Щ���ֳ� n ��, ���� (a1, b1), (a2, b2), ..., (an, bn) ��
 * ʹ�ô�1 �� n �� min(ai, bi) �ܺ����
 
 *	����: [1,4,3,2]
	���: 4
	����: n ���� 2, ����ܺ�Ϊ 4 = min(1, 2) + min(3, 4).
 * @since  2019��3��17�� ����9:07:46
 * @author luhao
 *
 */
public class ArrayPairSum {

	/**
	 * ������ Ȼ���ͷѭ�������������±�Ϊż����Ԫ��֮��
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result =  0;
        for (int i = 0; i < nums.length; i+=2) {
			result+=nums[i];
		}
        return result;
    }
}
