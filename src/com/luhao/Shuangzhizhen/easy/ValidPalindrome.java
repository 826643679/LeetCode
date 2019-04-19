package com.luhao.Shuangzhizhen.easy;

/**
 * 680. 验证回文字符串 Ⅱ 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 * 
 * @author Administrator
 *
 */
public class ValidPalindrome {

	public static void main(String[] args) {
		//validPalindrome("abcacqa");
		// validPalindrome("abc");
	}

	public boolean validPalindrome(String s) {
		int i = -1, j = s.length();
		while (++i < --j) {
			if (s.charAt(i) != s.charAt(j)) {
				return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
			}
		}
		return true;
	}

	private boolean isPalindrome(String s, int i, int j) {
		while (i < j) {
			if (s.charAt(i++) != s.charAt(j--)) {
				return false;
			}
		}
		return true;
	}
}
