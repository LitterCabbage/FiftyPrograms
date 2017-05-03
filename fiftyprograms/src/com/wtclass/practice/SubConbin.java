package com.wtclass.practice;

public class SubConbin {

	public static void main(String[] args) {
		char[] b = { 'a', 'b', 'c', 'd', 'e' };
		// subString(b);
		subChar(b);
	}

	/**
	 * 字符数组中连续字符的子字符串的组合可能
	 * 
	 * @param b
	 *            字符数组
	 */
	private static void subString(char[] b) {
		StringBuffer t = new StringBuffer();
		for (int i = 0; i < b.length; i++) {
			// t+= b[i];
			t.append(b[i]);
			System.out.println(t);
		}
		int c = 0;
		StringBuffer sb = new StringBuffer(t);
		for (int i = 0; i < b.length; i++) {
			for (int j = i; j < b.length; j++) {
				String s = sb.substring(i, j + 1);
				++c;
				System.out.print(s + " ");
			}
			System.out.println();
		}
		System.out.println("总数       " + c);

	}

	/**
	 * 字符数组中连续字符的子字符串的组合可能
	 * 
	 * @param c
	 *            字符数组
	 */
	private static void subChar(char[] c) {
		for (int i = 0; i < c.length; i++) {
			int con = c[i];
			for (int j = i + 1; j < c.length; j++) {
				con += c[j];
				System.out.print(con + " ");
			}
			System.out.println();
		}
//目前有问题
	}

}
