package com.wtclass.practice;

import java.math.BigInteger;

/**
 * 阶乘的一些方法
 *
 * @author anxingxing
 *
 *         2017年4月21日 下午5:00:02
 */
public class Factorial {

	public static void main(String[] args) {
		mutiply_4(9);
	}

	/**
	 * 阶乘 递归实现
	 * 
	 * @param n
	 * @return
	 */
	public static int mutiply_1(int n) {
		if (n <= 1) {
			return n;
		} else {
			return n * mutiply_1(n - 1);
		}
	}

	/**
	 * 阶乘 递归实现 增大数字范围
	 * 
	 * @param n
	 * @return
	 */
	public static BigInteger mutiply_2(int n) {
		if (n <= 1) {
			return BigInteger.valueOf(n);
		} else {
			return BigInteger.valueOf(n).multiply(mutiply_2(n - 1));
		}
	}

	/**
	 * 阶乘 非递归实现
	 * 
	 * @param n
	 */
	public static void mutiply_3(int n) {
		int sum = 1;
		for (int i = 1; i <= n; i++) {
			sum *= i;
		}
		System.out.println(sum);
	}

	/**
	 * 阶乘 非递归实现 增大数字范围
	 * 
	 * @param n
	 */
	public static void mutiply_4(int n) {
		BigInteger sum = BigInteger.valueOf(1);
		for (int i = 1; i <= n; i++) {
			sum = sum.multiply(BigInteger.valueOf(i));
		}
		System.out.println(sum.toString());
	}
}
