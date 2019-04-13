package com.zuoshen.Shuzu;

import java.util.Arrays;

/**
 * 908. 最小差值 I
 * @author Administrator
 *
 */
public class SmallestRangeI {
	
    public static int smallestRangeI(int[] A, int K) {
    	if(A.length<=1) return 0;
        Arrays.sort(A);
        float num = A[A.length-1]-A[0];
        if(K<Math.ceil(num/2)){
        	return (int) (num-2*K>0?num-2*K:0);
        }else{
        	System.out.println(0);
        	return 0;
        }
    }
	
	public static void main(String[] args) {
		int [] A={3,1,10};
		smallestRangeI(A,4);
	}

}
