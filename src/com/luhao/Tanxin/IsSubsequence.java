package com.luhao.Tanxin;

/**
 * 392. Is Subsequence (Medium)
 * 判断s是否为t的子序列
 * @author Administrator
 *
 */
public class IsSubsequence {
	
	public boolean isSubsequence(String s, String t) {
		int index = -1;
		for (char c: s.toCharArray()) {
			index = t.indexOf(c,index+1);	//从指定位置往后找返回字符在该字符串中第一次出现处的索引
			if(index == -1){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {

	}

}
