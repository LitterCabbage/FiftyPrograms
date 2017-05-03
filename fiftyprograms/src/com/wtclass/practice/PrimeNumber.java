package com.wtclass.practice;

public class PrimeNumber {

	public static void main(String[] args) {

		inPrime(2);
	}

	/**
	 * 求第n个数是否为质数
	 * 
	 * @param n
	 * @return
	 */
	public static void getPrime(int n) {
		if (n > 0) {
			if (isPrime(n)) {
				System.out.println(n + "是质数");
			} else {
				System.out.println(n + "不是质数");
			}

		} else {
			System.out.println(n + "非法数字");
		}
	}

	/**
	 * 求n范围以内的最大质数
	 * 
	 * @param n
	 * @return
	 */
	public static void inPrime(int n) {
		int range = n;
		if (n > 1) {
			// n范围内最大的，所以从n开始往小的判断
			for (int i = n; i > 0; n--) {
				if (isPrime(n)) {
					System.out.println(n + "是" + range + "范围内最大质数");
					break;
				}
			}
		} else {
			System.out.println(n + "为非法数字");
		}

	}

	/**
	 * 判断一个数是否为质数
	 * 
	 * @param n
	 *            整数
	 * @return
	 */
	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		} else {
			// 用（i * i <= n）取代了调用系统函数 （i <= Math.sqrt(n) ）
			for (int i = 2; i * i <= n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
