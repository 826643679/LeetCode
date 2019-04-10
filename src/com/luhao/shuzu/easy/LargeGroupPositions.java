package com.luhao.shuzu.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 830. 较大分组的位置
 * 在一个由小写字母构成的字符串 S 中，包含由一些连续的相同字符所构成的分组。
 * 例如，在字符串 S = "abbxxxxzyy" 中，就含有 "a", "bb", "xxxx", "z" 和 "yy" 这样的一些分组。
 * 我们称所有包含大于或等于三个连续字符的分组为较大分组。找到每一个较大分组的起始和终止位置。
 * 最终结果按照字典顺序输出。
 * @author Administrator
 *
 */
public class LargeGroupPositions {
	
    public static List<List<Integer>> largeGroupPositions(String S) {
    	List<List<Integer>> resList = new ArrayList();
    	if(S.length()<3)	 return resList;
    	char flag = S.charAt(0);
    	int start = 0,end =0;
    	for (int i = 0; i < S.length(); i++) {
			if(flag==S.charAt(i)){		//当下个字母和flag相等时
			   end=i;
			   if(end==S.length()-1&&end-start>1){	//当末尾有符合条件的字符串时
				   addlis(start,end,resList);
			   }
			}else{						//当下个字母和flag不同时
				if(end-start>1){				//当非末尾有符合条件的字符串时
					addlis(start,end,resList);
				}
				flag = S.charAt(i);
				start = i;
			}
		}
    	System.out.println(resList);
		return resList;
    }
    
    public static List<List<Integer>> addlis(int start,int end,List<List<Integer>> resList){
    	List<Integer> lis = new ArrayList();
		lis.add(start);
		lis.add(end);
		resList.add(lis);
		return resList;
    }
    
	public static void main(String[] args) {
		//String S = "abcdddeeeeaabbbcd";
		//String S = "abbxxxxzzy";
		//String S = "aaa";
		//String S = "babaaaabbb";
		String S = "bababbabaa";
		largeGroupPositions(S);
	}

}
