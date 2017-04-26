package com.math.basic;

import java.util.HashMap;
import java.util.Map;
/**
 *  map存放字符串，entry获取字符串
 *
 * @author anxingxing
 *
 *         2017年4月26日  下午6:34:24
 */
public class EntryGet {

	public static void main(String[] args) {
		String str = "Aabcdefgadsfadsfaf";
		getCount(str);
	}

	/**
	 * map方法处理英文字符串中字母出现的次数
	 * @param str
	 */
	private static void getCount(String str) {
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			String key = String.valueOf(str.charAt(i));
			if (!map.containsKey(key)) {
				map.put(key, 1);
			} else {
				int val = map.get(key);
				map.put(key, val + 1);
			}
		}

		for (Map.Entry i : map.entrySet()) {
			System.out.print(i.getKey() + ":" + i.getValue() + " ");
		}
	}

}
