package com.Algorithm.DoublePointer.easy;

/**
 * 633
 * @author Administrator
 *
 */
public class JudgeSquareSum {

	public static void main(String[] args) {
		judgeSquareSum(5);
	}
	
    public static boolean judgeSquareSum(int c) {
		int i = 0, j = (int) Math.sqrt(c);
		while(i<=j){
			int powsum = i*i+j*j;
			if(powsum==c){
				return true;
			}
			else if(powsum<c){
				i++;
			}else{
				j--;
			}
		}
    	return false;
    }
}
