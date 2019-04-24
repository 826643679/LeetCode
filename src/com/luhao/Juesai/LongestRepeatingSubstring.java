package com.luhao.Juesai;

/*
 * 给定字符串 S，找出最长重复子串的长度。如果不存在重复子串就返回 0。
 * AC
 */
public class LongestRepeatingSubstring {
	
    public static int longestRepeatingSubstring(String S) {
        int maxlength = 0;
    	for (int i = 0; i < S.length(); i++) {
			for (int j = i+1; j < S.length()-1; j++) {
				//当出现重复子串时
				if(S.charAt(i)==S.charAt(j)&&S.charAt(i+1)==S.charAt(j+1)){
					maxlength = Math.max(maxlength, 2);
					for(int k = 2;k < S.length()-j;k++){
						if(S.charAt(i+k)!=S.charAt(j+k)){
							break;
						}else{
							maxlength = Math.max(maxlength, k+1);
						}
						
					}
				}
			}
		}
    	return maxlength;
    }
    
	public static void main(String[] args) {
		//longestRepeatingSubstring("aabcaabdaab");
		//longestRepeatingSubstring("abbaba");
		//longestRepeatingSubstring("abcd");
		longestRepeatingSubstring("aaaaa");
	}

}
