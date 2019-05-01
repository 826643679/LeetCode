package com.DataStructures.Array.easy;

import java.util.Arrays;

/**
 * ����˿�ͱ����в�ͬ��С���ǹ�����A[i] �ǰ���˿ӵ�еĵ� i ���ǵĴ�С��B[j] �Ǳ���ӵ�еĵ� j ���ǵĴ�С��
 * ��Ϊ���������ѣ����������뽻��һ���ǹ������������������Ƕ�����ͬ���ǹ���������һ����ӵ�е��ǹ�����������ӵ�е��ǹ�����С���ܺ͡���
 * ����һ���������� ans������ ans[0] �ǰ���˿���뽻�����ǹ����Ĵ�С��ans[1] �� Bob ���뽻�����ǹ����Ĵ�С��
 * ����ж���𰸣�����Է��������κ�һ������֤�𰸴��ڡ�
 * ���룺A = [1,1], B = [2,2]
 * �����[1,2]
 * 
 * @since  2019��3��19�� ����8:38:33
 * @author luhao
 *
 */
public class FairCandySwap {

	public static void main(String[] args) {
		FairCandySwap fcs = new FairCandySwap();
		int[] A = {1,1};
		int[] B = {2,2};
		fcs.fairCandySwap(A, B);
	}
	
	/**
	 * �ȷֱ������������֮��
	 * ����ѭ���ֱ��ȥһ��Ԫ���ټ�����һ�������ȥ��Ԫ�� ������ֵ���ʱ���뵽�´�����������
	 * @param A
	 * @param B
	 * @return
	 */
    public int[] fairCandySwap(int[] A, int[] B) {
    	int a = 0, b = 0;
    	int [] flag = new int [2];
    	//�ֱ������������ĺ�
        for (int i = 0; i < A.length; i++) {
			a+=A[i];
		}
        for (int i = 0; i < B.length; i++) {
			b+=B[i];
		}
        
        for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if(a-2*(A[i]-B[j])==b){
					flag[0]=A[i];
					flag[1]=B[j];
				}
			}
		}
       return flag;
    }
}
