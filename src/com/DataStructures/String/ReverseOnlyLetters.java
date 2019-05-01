package com.DataStructures.String;

import java.util.Arrays;

/**
 * 917. 仅仅反转字母
 * @author Administrator
 *
 */
public class ReverseOnlyLetters {
	/**
	 * tips A:65 Z:90 a:97 z:122
	 * 将字符串中在65-122区间内的字符前后交换位置
	 * @param S
	 * @return
	 */
	public static String reverseOnlyLetters(String S) {
		int i = 0, j = S.length() - 1;
		char[] cha = S.toCharArray();
		while (i < j) {
			if (!Character.isLetter(cha[i])) {
				i++;
			} else if (!Character.isLetter(cha[j])) {
				j--;
			} else {
				char tmp = cha[i];
				cha[i] = cha[j];
				cha[j] = tmp;
				i++;
				j--;
			}
		}
		return String.valueOf(cha);
	}
	
	public static void main(String[] args) {
		//System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
		//System.out.println("j-Ih-gfE-dCba".equals(reverseOnlyLetters("a-bC-dEf-ghIj")));
		System.out.println(reverseOnlyLetters("7_28]"));
		System.out.println("7_28]".equals(reverseOnlyLetters("7_28]")));
	}

}
