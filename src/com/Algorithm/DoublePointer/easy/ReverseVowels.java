package com.Algorithm.DoublePointer.easy;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 345. ��ת�ַ����е�Ԫ����ĸ
 * @author Administrator
 *
 */
public class ReverseVowels {

	public static void main(String[] args) {
		reverseVowels("leetcode");
	}
		
	/**
	 * ��������ָ�룬һ����ǰ�����������һ���Ӻ���ǰ���ж�s���ַ��Ƿ����ԭ����ĸ����������ʱ�򽻻����������ַ������У�֮����ת���ַ���
	 * @param s
	 * @return
	 */
    public static String reverseVowels(String s) {
		HashSet<Character> vowels = new HashSet<>
		(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
		int i = 0,j = s.length()-1;
		char [] result = new char[s.length()];
		while(i <= j){
			char ai = s.charAt(i);
			char aj = s.charAt(j);
			if(!vowels.contains(ai)){
				result[i++]=ai;
			}else if(!vowels.contains(aj)){
				result[j--]=aj;
			}else{
				result[i++]=aj;
				result[j--]=ai;
			}
		}
    	return new String(result);
    }
}
