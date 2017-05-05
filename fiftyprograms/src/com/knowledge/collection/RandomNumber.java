package com.knowledge.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 一点关于Math.random()的基础
 *
 * @author anxingxing
 *
 *         2017年5月5日 下午4:17:03
 */
public class RandomNumber {

	public static void main(String[] args) {

		// System.out.println("获取1个a~z之间的随机字符："+getRandomChar('a','z'));
		// System.out.println("获取1个A~Z之间的随机字符："+getRandomChar('A','Z'));
		// System.out.println("获取1个0~9之间的随机字符："+getRandomChar('0','9'));
		// System.out.println("获取1个2~32之间的随机偶数："+getEvenNum(2,32));
		// System.out.println(test(30,39));
		// getSixShu(20);
//		getRandomArray(20);
		System.out.println(test(4,7));
	}

	public static double test(double n1, double n2) {
		return (int)(Math.random()*(n2-n1)+1)+n1;
	}

	/**
	 * 定义获取任意字符集之间的随机字符
	 * 
	 * @param c1
	 * @param c2
	 * @return
	 */
	public static char getRandomChar(char c1, char c2) {
		return (char) (c1 + Math.random() * (c2 - c1 + 1));
	}

	/**
	 * 定义产生随机偶数的方法
	 * 
	 * @param num1
	 *            起始范围参数
	 * @param num2
	 *            结束范围参数
	 * @return 随机的范围内偶数
	 */
	public static int getEvenNum(double num1, double num2) {
		// 产生num1~num2至今爱的随机数
		int s = (int) num1 + (int) (Math.random() * (num2 - num1));
		if (s % 2 == 0) {
			return s;
		} else {
			return s + 1;
		}
	}

	/**
	 * 产生6组n以内不相同的随即整数
	 * 
	 * @param n
	 *            范围
	 */
	public static void getSixShu(int n) {
		Random rand = new Random();
		boolean[] bool = new boolean[n];
		int randInt = 0;
		for (int i = 0; i < 6; i++) {
			do {
				randInt = rand.nextInt(n);
			} while (bool[randInt]);
			bool[randInt] = true;
			System.out.println(randInt);
		}
	}

	/**
	 * 产生指定长度的数组
	 * 
	 * @param n
	 *            数组长度
	 */
	public static void getRandomArray(int n) {
		int[] intRandom = new int[n];
		List mylist = new ArrayList(); // 生成数据集，用来保存随即生成数，并用于判断
		Random rd = new Random();
		while (mylist.size() < n) {
			int num = rd.nextInt(n + 1);
			if (!mylist.contains(num)) {
				mylist.add(num); // 往集合里面添加数据。
			}
		}
		/** 给数值赋值 */
		for (int i = 0; i < mylist.size(); i++) {
			intRandom[i] = (Integer) (mylist.get(i));
		}
		System.out.println(Arrays.toString(intRandom));
	}

	/*
	 * (int)(Math.random()*n)--->[0,n);
	 * 
	 * (int)(Math.random()*max)+min--->[min,max);
	 * 
	 * (int)(Math.random()*(max-min)+1)+min--->[min,max]
	 */

}
