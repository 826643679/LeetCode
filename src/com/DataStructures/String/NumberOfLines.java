package com.DataStructures.String;

import java.util.Arrays;

/**
 * 806. 写字符串需要的行数
 * widths 数组一共26个元素，依次为a-z所占用的单位，每行为100个单位
 * 返回的数组为两个元素，第一个元素是行数，第二个元素是最后一行占用的单位
 * tip： a-z = 97-122
 * @author Administrator
 *
 */
public class NumberOfLines {
	
	public static int[] numberOfLines(int[] widths, String S) {
		int[] numberOfLines = new int[2];
		int nums = 0; // 每行的占用空间数 最大只能是100
		for (int i = 0; i < S.length(); i++) {
			int spacei = widths[S.charAt(i) - 97];
			if (nums + spacei > 100) {
				numberOfLines[0]++;
				nums = spacei;
			} else {
				nums = nums + spacei;
			}
		}
		if(nums>0){
			numberOfLines[0]++;  //最后一行有数的时候
			numberOfLines[1] = nums;
		}
		return numberOfLines;
	}

	public static void main(String[] args) {
		int[] widths = new int []{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		String S = "abcdefghijklmnopqrstuvwxyz";
		int[] widths2 = new int []{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		String S2 = "bbbcccdddaaa";
		numberOfLines(widths,S);
		numberOfLines(widths2,S2);
	}

}
