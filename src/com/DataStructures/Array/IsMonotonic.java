package com.DataStructures.Array;

/**
 * 896. 单调数列
 * 排除掉不单调的，剩下的就是单调的
 * @author Administrator
 *
 */
public class IsMonotonic {
	/**
	 * compare
	 * 对象大于目标参数,返回1 
	 * 对象小于目标参数,返回-1 
	 * 对象等于目标参数,返回0
	 * @param A
	 * @return
	 */
    public boolean isMonotonic(int[] A) {
    	int flag = 0;
    	for (int i = 0; i < A.length-1; i++) {
			int tmp = Integer.compare(A[i], A[i+1]);
			if(tmp != 0){
				if(flag != 0 && flag != tmp) return false;
				flag = tmp;
			}
		}
    	return true;
    }
}
