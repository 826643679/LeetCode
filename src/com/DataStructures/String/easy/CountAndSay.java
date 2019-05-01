package com.DataStructures.String.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * ����������һ���������У��������е�������˳����б������õ���һ��������ǰ�������£�
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 ������  "one 1"  ("һ��һ") , �� 11��
 * 11 ������ "two 1s" ("����һ"��, �� 21��
 * 21 ������ "one 2",  "one 1" ��"һ����" ,  "һ��һ") , �� 1211��
 * ����һ�������� n��1 �� n �� 30��������������еĵ� n �
 * ע�⣺����˳�򽫱�ʾΪһ���ַ�����
 *
 * @since  2019��3��21�� ����10:46:43
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
					if(string.charAt(i)==string.charAt(i+1)) { //��ǰ����ַ���ͬʱ
						num++;
						if(i==string.length()-2) {
							s=s+num+string.charAt(i);          //�����λ������ͬ�ģ��м�Ҫ���⼸λ����
						}
					}
					else {
						s=s+num+string.charAt(i);
						num=1;
						if(i==string.length()-2) {           //������1λ�ǲ�ͬ�ģ��м�Ҫ�����1λ����
							s=s+num+string.charAt(i+1);
						}
					}
				}
			}
			return s;
	    }
}
