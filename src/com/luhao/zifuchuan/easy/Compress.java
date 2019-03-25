package com.luhao.zifuchuan.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/**
 * 443. 压缩字符串
 *
 * @since  2019年3月25日 下午11:39:31
 * @author luhao
 *
 */
public class Compress {

	public static void main(String[] args) {
		Compress cp = new Compress();
		char [] chars = {'a','a','b','b','c','c','c'};
		cp.compress(chars);
	}
	
    public int compress(char[] chars) {
    	Map<Character,Integer> hm = new HashMap<>();
    	for (int i = 0; i < chars.length; i++) {
			hm.put(chars[i], hm.containsKey(chars[i])?hm.get(chars[i])+1 :1);
		}
    	Vector vc = new Vector();
    	int i = 0;
    	for (char c : hm.keySet()) {
			if(hm.get(c)!=1){
				vc.add(c);
				vc.add(hm.get(c));
			}else{
				vc.add(c);
			}
		}
		return vc.size();
    }
}
