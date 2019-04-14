package com.luhao.Chusai;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个数字 N，当它满足以下条件的时候返回 true：
	把原数字旋转180°以后得到新的数字。
	如 0, 1, 6, 8, 9 旋转 180° 以后，得到了新的数字 0, 1, 9, 8, 6 。
	2, 3, 4, 5, 7 旋转 180° 后,得到的不是数字。
	易混淆数字 (confusing number) 就是一个数字旋转180°以后，得到和原来不同的数字，且新数字的每一位都是有效的
 *
 * @since  2019年4月14日 下午4:35:58
 * @author luhao
 *
 */
public class ConfusingNumber {
	
    public static boolean confusingNumber(int N) {
    	if(N == 0) return false;
    	Map<Integer,String> hm = new HashMap();
    	hm.put(0, "0");
    	hm.put(1, "1");
    	hm.put(6, "9");
    	hm.put(8, "8");
    	hm.put(9, "6");
    	String sb = "";
    	int flag = N;
        while(N!=0){
        	int temp = N%10;
        	if(temp==2||temp==3||temp==4||temp==5||temp==7){
        		System.out.println("false");
        		return false;
        	}else{
        		sb = sb + hm.get(temp);
        		N = N/10;
        	}
        }
        if (flag!=Integer.parseInt(sb)){
        	System.out.println("true");
            return true;
        }
        System.out.println("false");
    	return false;
    }
    
	public static void main(String[] args) {
		//confusingNumber(11);
		confusingNumber(916);
	}

}
