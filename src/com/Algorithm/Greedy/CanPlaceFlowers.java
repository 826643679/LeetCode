package com.Algorithm.Greedy;

/**
 * 605. 种花问题
 * 
 * @author Administrator
 *
 */
public class CanPlaceFlowers {
	/**
	 * 防御式编程思想：在 flowerbed 数组两端各增加一个 0， 这样处理的好处在于不用考虑边界条件，任意位置处只要出现三个连续 0 就可以栽上一棵花。
	 * @param flowerbed
	 * @param n
	 * @return
	 */
	
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int len = flowerbed.length;
		int cnt = 0;
		for (int i = 0; i < len && cnt < n; i++) {
			if (flowerbed[i] == 1) {
				continue;				//元素为1时，跳出本次循环，继续下次循环
			}
			int pre = i == 0 ? 0 : flowerbed[i - 1]; //当为第一个元素时，前一个元素设为0，否则取前一个元素
			int next = i == len - 1 ? 0 : flowerbed[i + 1]; //当不为最后一个元素时，取后一个元素，否则取0
			if (pre == 0 && next == 0) {	//种树
				cnt++;
				flowerbed[i] = 1;
			}
		}
		return cnt >= n;
	}

	public static void main(String[] args) {
		int[] flowerbed = { 1, 0, 0, 0, 1 };
		int n1 = 1;
		int n2 = 2;
		canPlaceFlowers(flowerbed, n1);
		canPlaceFlowers(flowerbed, n2);
	}

}
