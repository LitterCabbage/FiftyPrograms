package com.wtclass.practice;

import java.util.Arrays;

public class PrimeNumber {

	public static void main(String[] args) {
//		inPrime_1(4);
		selectPrime(8);
		getPrime_2(8);
	}
	/**
	 * 作标记筛选法
	 * @param n
	 */
	public static void selectPrime(int n){
		boolean[]  bo = new boolean[n+1];
		//把0到n+1都标记为true？
		for (int i = 2; i < bo.length; i++) {
			bo[i]=true;//初始化bo数组，如果这的初始化不要，可以反着使用，直接使前两个为true
		}
		System.out.println(Arrays.toString(bo));
		for (int i = 2; i * i <= n; i++) {
			if(bo[i]){
				for (int j = i*2; j <= n; j += i) {
					bo[j] = false;
				}
			}
		}
		//输出质数
		for (int k = 0; k < bo.length; k++) {
		     if(bo[k]){	
		    	 System.out.println(k);
		     }
		}
	}
	
	/**
	 * 筛选法，求n以内的最大质数
	 * @param n
	 */
	public static void getPrime_2(int n) {
		//用布尔数组，减小占用内存
		boolean[] boo = new boolean[n+1];
		for (int i = 2; i < boo.length; i++) {
			boo[i] = true;
		}
		System.out.println(Arrays.toString(boo));
		
		for (int i = 2; i * i <= n; i++) {
			if(boo[i]){//如果没有if，标记的次数会变很多
				for (int j = i*2; j <= n; j += i) {
					boo[j] = false;
				}
			}
		}
		for (int k = 0; k < boo.length; k++) {
			if(boo[k]){
				System.out.println(k);
			}
		}
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
					System.out.println(n + "是"+range+"范围内最大的质数");
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
