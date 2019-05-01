package com.luhao.Byte_Dance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxOne {

	public static int change(int n, int m, String s, char k) {
		// n为数列长度，m为操作次数
		int max = 0;
		// 需要操作的数字
		List<Integer> sums = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == k) {
				sums.add(i);
			}
		}
		// 当操作数大于等于要操作数字数时，返回整个字符串的长度
		if (sums.size() <= m) {
			return n;
		}
		sums.add(s.length());
		// 得到操作数对应替换后的下标值，即为从0开始替换后字符串的长度
		max = sums.get(m);
		// 从初始间隔值开始遍历，逐渐增大，每次减去间隔值
		for (int i = m + 1; i < sums.size(); i++) {
			// i为与初始值间隔m的下标值，从m+1开始
			max = Integer.max(max, sums.get(i) - sums.get(i - m - 1) - 1);
		}
		return max;
	}

	// 4 1
	// 0101
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int i = n;
		String s = "";
		while (i > 0) {
			s = s + sc.nextInt();
			i--;
		}

		System.out.println(change(n, m, s, '0'));
	}

}
