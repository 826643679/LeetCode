package com.Algorithm.BinarySearch;

/**
 * 744. 寻找比目标字母大的最小字母
 * 
 * @author Administrator
 *
 */
public class NextGreatestLetter {
	public static char nextGreatestLetter(char[] letters, char target) {
		int l = 0, r = letters.length - 1;
		while (l <= r) {
			int mid = (l + r) / 2;
			if (letters[mid] <= target) {
				l = mid + 1; // 目标值大于等于中间值时，要返回的字母在mid的右边
			} else {
				r = mid - 1; //否则 要返回的元素在mid 的左边
			}
		}
		System.out.println(l);
		//当目标元素小于第一个元素时，减小右边界的值，最终l等于左边界值
		//当目标元素大于等于最大的元素时，增大左边界的值，最终l会等于数组长度
		return l < letters.length ? letters[l] : letters[0];
	}

	public static void main(String[] args) {
		char[] letters = { 'c', 'f', 'j' };
		char target1 = 'a';
		char target2 = 'c';
		char target3 = 'd';
		char target4 = 'g';
		char target5 = 'j';
		char target6 = 'k';
		nextGreatestLetter(letters, target1);	//c	左边界时
		nextGreatestLetter(letters, target2);	//f
		nextGreatestLetter(letters, target3);	//f
		nextGreatestLetter(letters, target4);	//j
		nextGreatestLetter(letters, target5);	//c	右边界时
		nextGreatestLetter(letters, target6);	//c	右边界时
	}

}
