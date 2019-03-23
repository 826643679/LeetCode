package com.luhao.shuzu.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。例如，如果一个字符在每个字符串中出现 3
 * 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。 你可以按任意顺序返回答案。
 *
 * 输入：["bella","label","roller"] 输出：["e","l","l"]
 * 
 * @since 2019年3月17日 上午9:54:43
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
	 * 循环数组，记录第一个字符串每个字符出现的次数存到数组flag里 保持数组flag存的计数为最小 将flag里的计数和字符一一对应加到新数组里并返回
	 * 
	 * @param A
	 * @return
	 */
	public List<String> commonChars(String[] A) {
		int[] flag = new int[26];
		List<String> result = new ArrayList<>();
		boolean ishead = true;
		for (String a : A) {

			if (ishead) { // 当为数组A的第一个元素时
				for (int j = 0; j < a.length(); j++) {
					char c = a.charAt(j);
					flag[c - 'a']++;
				}
				ishead = false;
				continue;
			} else { // 不为第一个元素时
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
