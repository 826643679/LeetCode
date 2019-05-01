package com.Algorithm.DoublePointer.easy;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 345. 反转字符串中的元音字母
 * @author Administrator
 *
 */
public class ReverseVowels {

	public static void main(String[] args) {
		reverseVowels("leetcode");
	}
		
	/**
	 * 定义两个指针，一个从前往后遍历，另一个从后往前，判断s的字符是否包含原因字母，当包含的时候交换并存入新字符数组中，之后再转成字符串
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
