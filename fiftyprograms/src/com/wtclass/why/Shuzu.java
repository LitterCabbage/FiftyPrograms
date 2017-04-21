package com.wtclass.why;

import java.math.BigInteger;

public class Shuzu {

	public static void main(String[] args) {

		// int[] a = { 3, 1, 2, 4, 5 };

		// for (int i = 2; i < 100; i++) {
		// for (int j = 2; j < i; j++) {
		// if()
		// }
		// }
		
	}
	

	// char[] ch ={'a','b','c','d','e'};
	//
	// for (int i = 0; i < ch.length; i++) {
	// char start = ch[i];
	// for (int j = i+1; j < ch.length; j++) {
	// char link = ch[j];
	// start = link;
	// System.out.print(start+" "+link);
	// }
	// }
	// }

	/**
	 * 暴力法，计算出连续子元素的最大和
	 * 
	 * @param a
	 */
	public static void SimpleSubSum(int[] a) {
		int sum = 0;
		int start = 0;
		for (int i = 0; i < a.length; i++) {// 代表计算的起点
			start = a[i];
			for (int j = i + 1; j < a.length; j++) {// 要开始取后面的连续
				sum = start + a[j];
				start = sum;
				System.out.print(sum + " ");
			}
			System.out.println();
		}
	}

	/**
	 * 找出出现一次的元素 2^10=1024 0(n) 可以找出出现奇数次的元素，但是只有一个这个的元素
	 * 
	 * @param a
	 */
	public static void selectOdd(int[] a) {
		int x = 0;
		for (int i = 0; i < a.length; i++) {
			x ^= a[i];
		}
		System.out.println(x);
	}

	/**
	 * 数组中的连续子元素最大和 0(n) 线性
	 * 
	 * @param a
	 */
	private static void maxSum(int[] a) {
		int thisSum = 0;
		int maxSum = a[0];
		for (int j = 0; j < a.length; j++) {
			thisSum += a[j];
			if (thisSum > maxSum) {
				maxSum = thisSum;
			}
			if (thisSum < 0) {
				thisSum = 0;
			}
		}
		System.out.println(maxSum);
	}

	/**
	 * 两个数的最大公约数欧几里得算法
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int getEuclid(int a, int b) {
		while (b != 0) {
			int ren = a % b;
			a = b;
			b = ren;
		}
		return a;
	}

	/**
	 * 阶乘， 递归实现
	 * 
	 * @param n
	 * @return
	 */
	public static int multiplay_1(int n) {
		if (n <= 1) {
			return n;
		}
		return n * multiplay_1(n - 1);
	}

	/**
	 * 阶乘，递归实现，大数据
	 * 
	 * @param n
	 * @return
	 */
	public static BigInteger multiplay_2(int n) {
		if (n <= 1) {
			return BigInteger.valueOf(1);
		}
		return BigInteger.valueOf(n).multiply(multiplay_2(n - 1));
	}

	/**
	 * 阶乘， 非递归实现
	 * 
	 * @param n
	 */
	public static void multi3(int n) {
		// int sum = 1;
		BigInteger sum = BigInteger.valueOf(n);
		for (int i = 1; i <= n; i++) {
			sum = sum.multiply(BigInteger.valueOf(i));
		}
		System.out.println(sum.toString());
	}

	/**
	 * 斐波那契数列，递归实现
	 * 
	 * @param n
	 * @return
	 */
	public static int fib1(int n) {
		if (n <= 2) {
			return 1;
		} else {
			return fib1(n - 1) + fib1(n - 2);
		}
	}

	/**
	 * 斐波那契数列，递归实现，三目运算
	 * 
	 * @param n
	 * @return
	 */
	public static int fib2(int n) {
		return n <= 2 ? 1 : fib2(n - 1) + fib2(n - 2);
	}

	/**
	 * 斐波那契数列，非递归实现，for循环
	 * 
	 * @param n
	 * @return
	 */
	public static int fib3(int n) {
		int a = 1;
		int b = 1;
		int c = 1;
		for (int i = 3; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

	/**
	 * 最大公约数，递归 gcd(a,b) = gcd(b,a mod b)
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}
