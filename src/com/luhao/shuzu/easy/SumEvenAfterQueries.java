package com.luhao.shuzu.easy;

import java.util.Arrays;

/**
 * 给出一个整数数组 A 和一个查询数组 queries。
      对于第 i 次查询，有 val = queries[i][0], index = queries[i][1]，我们会把 val 加到 A[index] 上。然后，第 i 次查询的答案是 A 中偶数值的和。
    （此处给定的 index = queries[i][1] 是从 0 开始的索引，每次查询都会永久修改数组 A。）
       返回所有查询的答案。你的答案应当以数组 answer 给出，answer[i] 为第 i 次查询的答案。
 *
 * @since  2019年3月16日 下午11:39:27
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
	 * 先用一个for循环来循环queries数组，每次取出数组之后改变A数组，然后计算偶数元素的和
	 * 再依次赋值给新数组,返回新数组
	 * @param A
	 * @param queries
	 * @return
	 */
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int [] answer = new int[queries.length];	//定义要返回的数组
        for (int i = 0; i < queries.length; i++) {
        	A[queries[i][1]]+=queries[i][0];
        	int flag = 0; 	//定义局部变量用来给新数组赋值
        	for (int j = 0; j < A.length; j++) {
				if(A[j]%2==0)	flag+=A[j];
			}
        	answer[i]=flag;
		}
        return answer;
    }
}
