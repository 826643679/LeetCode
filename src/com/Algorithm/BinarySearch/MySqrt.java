package com.Algorithm.BinarySearch;

/**
 * 69 实现sqrt
 * @author Administrator
 *
 */
public class MySqrt {

	// 二分查找
	public static int mySqrt(int x) {
		if (x <= 1) {
			return x;
		}
		int l = 1, r = x;
		while (l <= r) {
			int mid = (l + r) / 2;
			if (mid == x / mid) {
				return mid;
			} else if (mid > x / mid) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return r;
	}

	public static void main(String[] args) {
		mySqrt(8);
	}
}
