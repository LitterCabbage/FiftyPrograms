package com.wtclass.why;

public class FibonacciNumber {

	public static void main(String[] args) {
		// System.out.println(fib_1(3));
		// System.out.println(fib_3(3));
		listFib(5);
		// sumFib(3);
	}

	/**
	 * 列出斐波那契数列的前n项，并计算前n项和
	 * 
	 * @param n
	 */
	private static void listFib(int n) {
		System.out.println("斐波那契数列的前" + n + "项：");
		for (int i = 1; i <= n; i++) {
			System.out.print(fib_1(i) + " ");
		}
		System.out.println();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += fib_1(i);
		}
		System.out.println("斐波那契数列的前" + n + "项的和：" + "\n" + sum);
	}

	/**
	 * 求第n个斐波那契数 递归
	 * 
	 * @param n
	 *            大于0的整数
	 * @return
	 */
	public static int fib_1(int n) {
		if (n <= 2) {
			return 1;
		} else {
			return fib_1(n - 1) + fib_1(n - 2);
		}
	}

	/**
	 * 求第n个斐波那契数 三目运算
	 * 
	 * @param n
	 *            大于0的整数
	 * @return
	 */
	public static int fib_2(int n) {
		return n <= 2 ? 1 : fib_2(n - 1) + fib_2(n - 2);
	}

	/**
	 * 求第n个斐波那契数 非递归
	 * 
	 * @param n
	 *            大于0的整数
	 * @return
	 */
	public static int fib_3(int n) {
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

}
