package com.luhao.shuzu.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ��������Сд��ĸ��ɵ��ַ������� A�������б��е�ÿ���ַ����ж���ʾ��ȫ���ַ��������ظ��ַ�����ɵ��б����磬���һ���ַ���ÿ���ַ����г��� 3
 * �Σ������� 4 �Σ�����Ҫ�����մ��а������ַ� 3 �Ρ� ����԰�����˳�򷵻ش𰸡�
 *
 * ���룺["bella","label","roller"] �����["e","l","l"]
 * 
 * @since 2019��3��17�� ����9:54:43
 * @author luhao
 *
 */
public class CommonChars {
	public static void main(String[] args) {
		CommonChars cc = new CommonChars();
		String[] A = { "bella", "label", "roller" };
		cc.commonChars(A);
	}

	/**
	 * ѭ�����飬��¼��һ���ַ���ÿ���ַ����ֵĴ����浽����flag�� ��������flag��ļ���Ϊ��С ��flag��ļ������ַ�һһ��Ӧ�ӵ��������ﲢ����
	 * 
	 * @param A
	 * @return
	 */
	public List<String> commonChars(String[] A) {
		int[] flag = new int[26];
		List<String> result = new ArrayList<>();
		boolean ishead = true;
		for (String a : A) {

			if (ishead) { // ��Ϊ����A�ĵ�һ��Ԫ��ʱ
				for (int j = 0; j < a.length(); j++) {
					char c = a.charAt(j);
					flag[c - 'a']++;
				}
				ishead = false;
				continue;
			} else { // ��Ϊ��һ��Ԫ��ʱ
				int[] num = new int[26];
				for (int j = 0; j < a.length(); j++) {
					char c = a.charAt(j);
					num[c - 'a']++;
				}
				for (int i = 0; i < flag.length; i++) {
					flag[i] = Math.min(flag[i], num[i]);
				}
			}
		}
		
		for (int i = 0; i < flag.length; i++) {
			if(flag[i]!=0){
				for (int j = 0; j < flag[i]; j++) {
					result.add(""+(char)('a'+i));
				}
			}
		}
		return result;
	}
}
