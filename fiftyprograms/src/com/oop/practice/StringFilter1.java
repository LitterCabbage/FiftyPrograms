package com.oop.practice;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class StringFilter1 {

	/*
	 * 编写一个字符串过滤程序，若字符串中出现多个相同的字符，将非首次出现的字符过滤
	 */
	public static void main(String[] args) {
		System.out.println("请输入：");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		StringFilter1 ts = new StringFilter1();
		System.out.println(ts.stringFilter(input));
	}

	public String stringFilter(String input) {
		String strTemp = input;
		char[] ch = strTemp.toCharArray();
		Set<Character> cs = new LinkedHashSet<Character>();
		for (int i = 0; i < ch.length; i++) {// 利用set实现字符过滤
        	cs.add(ch[i]);
		}
		String temp = "";
		for (Iterator<Character> it = cs.iterator(); it.hasNext();) {// 重新组合字符串
			temp += it.next();
		}
		return temp;
	}
}
