package com.DataStructures.String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 有一个仅包含’a’和’b’两种字符的字符串s，长度为n，每次操作可以把一个字符做一次转换（把一个’a’设置为’b’，或者把一个’b’置成’a’)；
 * 但是操作的次数有上限m，问在有限的操作数范围内，能够得到最大连续的相同字符的子串的长度是多少。
 * 
 * @author Administrator
 *
 */
public class MinOper {
	
	/**
	 * 利用前缀和数组
	 * 例如：
	 * n=10,m=1,s=baabaabaab
	 *   b a a b a a b a a b
	 *   0 1 2 3 4 5 6 7 8 9
	 *  
	 *   将 b-->a
	 *   b 的前缀和数组为
	 *          sums={ 0, 3, 6, 9, 10}//10 为字符串长度
	 *   计算长度分别为:
	 *          3  6-0-1=5   9-3-1=5  10-6-1=3
	 *     ==>>max = max{ max, sums[i]-sum[i-m-1]-1}
	 */
    public static int change(int n, int m, String s, char k) {
    	//n为字符串长度，m为操作次数
        int max = 0;
        //需要操作的字母
        List<Integer> sums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == k) {
                sums.add(i);
            }
        }
        //当操作数大于等于要操作字母数时，返回整个字符串的长度
        if (sums.size() <= m) {
            return n;
        }
        sums.add(s.length());
        System.out.println(sums);
        //得到操作数对应替换后字母的下标值，即为从0开始替换后字符串的长度
        max = sums.get(m);	
        //从初始间隔值开始遍历，逐渐增大，每次减去间隔值
        for (int i = m + 1; i < sums.size(); i++) {
        	//i为与初始值间隔m的下标值，从m+1开始
            max = Integer.max(max, sums.get(i) - sums.get(i - m - 1) - 1);
        }
        return max;
    }
    
    //8 1
    //aabaabaa
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        //分两种情况对比
        System.out.println(Integer.max(change(n, m, s, 'a'), change(n, m, s, 'b')));
    }

}
