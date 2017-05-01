package com.fifty.programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FourOne {

	public static void main(String[] args) {

		String str = "I come from County DingYuan Province AnHui.";
		subString(str);
	}

	/**
	 * 计算字符串中子串出现的次数
	 * @param str 需要处理的字符串
	 */
	private static void subString(String s) {
		
		char[] ch = s.toCharArray();
		int count = 1;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				count++;
			}
		}
		System.out.println("字符串中共有" + count + "子串");
	}
	
	
	

}
