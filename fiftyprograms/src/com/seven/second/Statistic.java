package com.seven.second;

import java.util.Scanner;

/**
 * 题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。 
 * 程序分析：利用while语句,条件为输入的字符不为'\n'.
 *
 * @author axingxing
 *
 *         2017年4月11日 下午6:22:17
 */
public class Statistic {

	public static void main(String[] args) {

		System.out.println("请输入：");
		Scanner sc = new Scanner(System.in);
		//将输入的字符转换为字符串
		String  s = sc.nextLine();
		sc.close();
		count(s);	
	}

	/**
	 * 统计英文字母、空格、数字和其它字符的个数
	 * @param s
	 */
	private static void count(String s) {
		//汉字
		String chinese = "[\u4e00-\u9fa5]";
		//字母
		String letter = "[a-zA-Z]";
		//数字
		String number = "[0-9]";
		//空格
		String space = "\\s";
		
		//计数器
		int countC = 0;
		int countL = 0;
		int countS = 0;
		int countN = 0;
		int countO = 0;
		
		//将字符串转换为字符数组
		char[] ch = s.toCharArray();
		
		//汉字只能作为字符串处理
		String[] str = new String[ch.length];
		for (int i = 0; i < ch.length; i++){ 
			str[i] =String.valueOf(ch[i]);
		}
			//遍历字符串数组中的元素
			for (String st :str) {
				if(st.matches(chinese)){
					countC++;
				}else if(st.matches(letter)){
					countL++;
				}else if(st.matches(number)){
					countN++;
				}else if(st.matches(space)){
					countS++;
				}else {
					countO++;
				}
				
		}
			System.out.println("输入的汉字个数：" + countC);
			System.out.println("输入的字母个数：" + countL);
			System.out.println("输入的数字个数：" + countN);
			System.out.println("输入的空格个数：" + countS);
			System.out.println("输入的其它字符个数：" + countO);
	}
}
