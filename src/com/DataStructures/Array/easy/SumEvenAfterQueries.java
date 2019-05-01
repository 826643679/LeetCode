package com.DataStructures.Array.easy;

import java.util.Arrays;

/**
 * ����һ���������� A ��һ����ѯ���� queries��
      ���ڵ� i �β�ѯ���� val = queries[i][0], index = queries[i][1]�����ǻ�� val �ӵ� A[index] �ϡ�Ȼ�󣬵� i �β�ѯ�Ĵ��� A ��ż��ֵ�ĺ͡�
    ���˴������� index = queries[i][1] �Ǵ� 0 ��ʼ��������ÿ�β�ѯ���������޸����� A����
       �������в�ѯ�Ĵ𰸡���Ĵ�Ӧ�������� answer ������answer[i] Ϊ�� i �β�ѯ�Ĵ𰸡�
 *
 * @since  2019��3��16�� ����11:39:27
 * @author luhao
 *
 */
public class SumEvenAfterQueries {

	public static void main(String[] args) {
		int[] A = {1,2,3,4};
		int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};
		SumEvenAfterQueries sq = new SumEvenAfterQueries();
		sq.sumEvenAfterQueries(A, queries);
	}
	
	/**
	 * ����һ��forѭ����ѭ��queries���飬ÿ��ȡ������֮��ı�A���飬Ȼ�����ż��Ԫ�صĺ�
	 * �����θ�ֵ��������,����������
	 * @param A
	 * @param queries
	 * @return
	 */
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int [] answer = new int[queries.length];	//����Ҫ���ص�����
        for (int i = 0; i < queries.length; i++) {
        	A[queries[i][1]]+=queries[i][0];
        	int flag = 0; 	//����ֲ����������������鸳ֵ
        	for (int j = 0; j < A.length; j++) {
				if(A[j]%2==0)	flag+=A[j];
			}
        	answer[i]=flag;
		}
        return answer;
    }
}
