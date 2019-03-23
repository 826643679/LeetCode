package com.luhao.zifuchuan.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
 * 注意：整数顺序将表示为一个字符串。
 *
 * @since  2019年3月21日 下午10:46:43
 * @author luhao
 *
 */
public class CountAndSay {
	
	public static void main(String[] args) {
		CountAndSay ca = new CountAndSay();
		ca.countAndSay(5);
	}
	
	 public String countAndSay(int n) {
	        String s = "";
			if(n==1)
				return "1";
			if(n==2)
				return "11";
			if(n > 2) {
				String string = countAndSay(n-1);
				int num=1;
				for(int i=0;i<string.length()-1;i++) {
					if(string.charAt(i)==string.charAt(i+1)) { //当前面的字符相同时
						num++;
						if(i==string.length()-2) {
							s=s+num+string.charAt(i);          //如果后几位都是相同的，切记要把这几位加上
						}
					}
					else {
						s=s+num+string.charAt(i);
						num=1;
						if(i==string.length()-2) {           //如果最后1位是不同的，切记要把最后1位加上
							s=s+num+string.charAt(i+1);
						}
					}
				}
			}
			return s;
	    }
}
