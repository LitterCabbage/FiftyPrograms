package com.wtclass.practice;

/**
 * 两数最大公约数的算法
 *
 * @author anxingxing
 *
 *         2017年5月4日 下午8:42:51
 */
public class CommonDivisor {

	/**
	 * 最大公约数,递归0(n) gcd(a,b) = gcd(b, a % b)
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

	/**
	 * 两个数的最大公约数欧几里得算法 线性
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int getOuji(int a, int b) {
		while (b != 0) {
			int ren = a % b;
			a = b;
			b = ren;
		}
		return a;
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
}
