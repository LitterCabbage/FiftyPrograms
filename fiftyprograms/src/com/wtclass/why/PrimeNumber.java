package com.wtclass.why;

/**
 * 质数判断的相关方法
 *
 * @author anxingxing
 *
 *         2017年4月21日 上午10:04:47
 */
public class PrimeNumber {

	public static void main(String[] args) {

		// inPrime(1);
		getPrime(-1);
	}

	/**
	 * 求第n个数是否为质数
	 * 
	 * @param n
	 *            大于1的整数
	 */
	public static void getPrime(int n) {
		if (isPrime(n)) {
			System.out.println(n + "是质数");
		} else {
			System.out.println(n + "为非法数字");
		}

	}

	/**
	 * 求n范围以内的最大质数
	 * 
	 * @param n
	 *            大于1的整数范围
	 */
	public static void inPrime(int n) {
		int range = n;
		if (n > 1) {
			for (int i = n; i > 1; n--) {

				if (isPrime(n)) {
					System.out.println(n + "是" + range + "范围内最大的质数");
					break;
				}
			}
		} else {
			System.out.println("输入范围" + range + "无效");
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
			// 用i * i <= n取代了调用系统函数i <= Math.sqrt(a)
			for (int i = 2; i * i <= n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
