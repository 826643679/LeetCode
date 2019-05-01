package com.luhao.Byte_Dance;

import java.util.HashMap;
import java.util.Map;

public class Cow {

	public static int cows(int n) {
		int sum = 1;
		for (int i = 1; i <= n; ++i) {
			sum += new_cows(i);
		}
		System.out.println(sum);
		return sum;
	}

	public static int new_cows(int x) {
		if (x < 3) { // 小于3岁时 不生产
			return 0;
		} else if (x >= 3 && x <= 10) { // 大于三岁时
			return 1 + new_cows(x - 2);
		} else if (x > 10) {
			return 1 + new_cows(x - 2);
		}
		return x;
	}

	public static void main(String[] args) {
		cows(3); // 2
		cows(4); // 3
		cows(5); // 5
		cows(12); // 123
	}

}
