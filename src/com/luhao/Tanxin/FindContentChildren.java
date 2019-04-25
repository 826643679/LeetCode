package com.luhao.Tanxin;

import java.util.Arrays;

/**
 * 455. 分发饼干
 * 
 * @author Administrator
 *
 */
public class FindContentChildren {

	// 求出s中比g中大的元素个数
	public int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g); // 小孩
		Arrays.sort(s); // 饼干
		int gi = 0, si = 0;
		while (gi < g.length && si < s.length) {
			if (g[gi] <= s[si]) {
				gi++;
			}
			si++;
		}
		return gi;
	}

	public static void main(String[] args) {

	}

}
