package com.wtclass.practice;

/**
 * 字符组成字符串的可能组合
 *
 * @author anxingxing
 *
 *         2017年5月4日 下午10:10:20
 */
public class SubConbin {

	public static void main(String[] args) {
		char[] b = { 'a', 'b', 'c', 'd', 'e' };
		subString2(b);
		// subChar(b);
	}

	/**
	 * 字符数组中连续字符的子字符串的组合可能
	 * 
	 * @param b
	 *            字符数组
	 */
	private static void subString1(char[] ch) {
		StringBuffer t = new StringBuffer();
		for (int i = 0; i < ch.length; i++) {
			t.append(ch[i]);// 追加字符
		}
		int c = 0;
		StringBuffer sb = new StringBuffer(t);
		for (int i = 0; i < ch.length; i++) {
			for (int j = i; j < ch.length; j++) {
				String s = sb.substring(i, j + 1);
				c++;
				System.out.print(s + " ");
			}
			System.out.println();
		}
		System.out.println("总数       " + c);

	}

	private static void subString2(char[] ch) {
		int c = 0;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i; j < ch.length; j++) {
				sb.append(ch[j]);
        System.out.print(sb.toString() + " ");
				c++;
			}
			System.out.println();
			sb.delete(0, sb.length());//每一轮i的循环都会加上上一轮的所有追加结果
		}
		System.out.println(c);
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
		// 目前有问题
	}

}
